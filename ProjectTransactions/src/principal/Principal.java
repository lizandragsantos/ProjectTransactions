package principal;

import java.util.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import transaction.*;
import application.*;
import bank.*;

public class Principal {
	/*
	public static void main(String[] args) {

		TransactionManager transactionmanager = new TransactionManager();

		
			transactionmanager.AddTransaction(new LogDecorator(InstanciateTransaction()));
			transactionmanager.ExecuteTransactions();
			
			Iterator<Transaction> verificarlog = transactionmanager.getExecuted();
			
			while(verificarlog.hasNext()) {
				Transaction transaction;
				
				transaction = verificarlog.next();
				transaction.Execute();
			} 
	}

	public static Transaction InstanciateTransaction() {
		String typetransaction;
		double amount = 0;
		int option, opt;
		Date date;
		AppTransaction apptransaction = null;
		BankTransaction transaction = null;
		Account accounta = new Account(155454545);
		Account accountb = new Account(454127893);
		
		option = Integer.parseInt(JOptionPane
				.showInputDialog("1 - Transação Simples\n"
						+ "2 - Transação Composta"));
		switch (option) {
		case 1: {
			typetransaction = JOptionPane.showInputDialog("T - Transferência\n" + "D - Deposito");
			if (typetransaction.toLowerCase().equals("t")) {
				amount = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para Transferência"));
				try{
				transaction = new Transference(accounta, accountb, BigDecimal.valueOf(amount), new Date());
				JOptionPane.showMessageDialog(null, "Transação Realizada com sucesso");
				}
				catch(RuntimeException e){
					JOptionPane.showMessageDialog(null, "Não foi possível realizar Transferencia.");
				}
				
			}
			if (typetransaction.toLowerCase().equals("d")) {
				amount = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para Deposito"));
				try{
				transaction = new Deposit(accountb, BigDecimal.valueOf(amount), new Date());
				JOptionPane.showMessageDialog(null, "Deposito Realizada com sucesso");
				}
				catch(RuntimeException e){
					JOptionPane.showMessageDialog(null, "Não foi possível realizar Deposito.");
				}
			}
			apptransaction = new AppTransaction(transaction);
			return apptransaction;
		}
		case 2: {
			GregorianCalendar c = new GregorianCalendar();
			c.add(c.DAY_OF_MONTH, 10);
			date = c.getTime();
			//System.out.println(date);
			CompoundTransaction compoundtransaction = new CompoundTransaction(
					date);
			//compoundtransaction.add(InstanciateTransaction());
            
			do {
				compoundtransaction.add(InstanciateTransaction());
				opt = Menu();
			} while (opt < 2);
			
			
			return compoundtransaction;
		}

		}
		return null;
	}*/

	public static int Menu() {
		int op;
		op = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Deseja adicionar Transação?\n" + "1 - sim\n" + "2 - não\n"));
		return op;
	}

} 
