package first;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.SQLException;

public class AccountManager {
	private Connection connection;
	private Scanner scanner;
	public AccountManager(Connection connection) {
		super();
		this.connection = connection;
		this.scanner=scanner;
	}
	
	public void  credit_money(long account_number) {
		System.out.println("Enter Amount: ");
		double amount=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Security Pin: ");
		String security_pin=scanner.nextLine();
		String sql="insert into accounts(account_number,security_pin)values(?,?)";
		
		try(PreparedStatement pst=connection.prepareStatement(sql) {
			pst.setLong(1,account_number);
			pst.setString(2,security_pin);
			pst.executeUpdate();
			System.out.println("Amount creadited ");
		}catch (SQLException e) {
		      e.printStackTrace();
		}
	}
	public void debit_amount(long account_number,String security_pin) {
		System.out.println("Enter amount : ");
		double amount=scanner.nextDouble();
		String withdrawsql="update accounts set balance=balance-?where acc-no=?";
		try {
			connection.setAutoCommit(false);
			Account  from=getAccount(account_number);
			if(from == null||from.getBalance()<amount) {
				throw new SQLException("insufficient balance or invalid account");
			}
			try(PreparedStatement pst=connection.prepareStatement(withdrawsql)){
				pst.setDouble(1,amount);
				pst.setLong(2,account_number);
			}
			connection.commit();
		}catch (SQLException s) {
			try{
				connection.rollback();
				System.out.println("Transaction failed");
			}catch (SQLException e) {
				e.printStackTrace();
			}s.printStackTrace();
		}finally {
			try {
				connection.setAutoCommit(true);
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void transfer_amount(long account_number ) {
			System.out.println("Enter the Receiver acc_no");
			long receiver_acc_no=scanner.nextLong();
			System.out.println("Enter the amount");
			double amount=scanner.nextDouble();
			System.out.println("Enter the security_pin:");
			String security_pin=scanner.next();
			try {
				connection.setAutoCommit(false);
				if(account_number!=0) {
					PreparedStatement pst=connection.prepareStatement("SELECT * FROM Accounts WHERE account_number=? and security_pin=?");
				    pst.setLong(1, receiver_acc_no);
				    pst.setString(1, security_pin);
				    ResultSet rst=pst.executeQuery();
				    
				    if(rst.next()) {
				    	String credit_query="UPDATE Accounts SET balance=balance + ? WHERE account_number=?";
				    	PreparedStatement pst1=connection.prepareStatement(debit_query);
				    	pst1.setDouble(1, amount);
				    	pst1.setLong(2, account_number);
				    	 int rowsAffected=pst1.executeUpdate();
				    	 if(rowsAffected>0) {
				    		 System.out.println(amount);
				    		 connection.commit();
				    	 }
				    }
				
				}
			}
			
			
			
			
		}
		
		
	}

	private Account getAccount(Account account_number) {
		// TODO Auto-generated method stub
		return account_number;
	}

}
