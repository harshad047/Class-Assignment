package com.tss.structural.proxy.test;

import com.tss.structural.proxy.model.BankAccount;
import com.tss.structural.proxy.model.BankAccountProxy;

public class ProxyPatternDemo {
	public static void main(String[] args) {
        BankAccount account = new BankAccountProxy();

        // Successful access
        account.withdraw("John Doe", "1234", 200);

        // Failed access
        account.withdraw("John Doe", "0000", 200);
    }
}
