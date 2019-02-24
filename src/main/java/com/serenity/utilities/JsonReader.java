package com.serenity.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.serenity.model.CreateAccount;

public class JsonReader {
    private final String createAccountPath = System.getProperty("user.dir")+"/Data/"+"createAccount.json";
	private List<CreateAccount> createAccountList;

    public JsonReader() { 
        createAccountList = getBasicCreateAccountData();
    }

    private List<CreateAccount> getBasicCreateAccountData() {
        Gson gson = new Gson();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(createAccountPath));
            CreateAccount[] leads = gson.fromJson(bufferedReader, CreateAccount[].class);
            return Arrays.asList(leads);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Create Lead test date file not found at path:" + createAccountPath);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public final CreateAccount getpageByFirstName(String name) {
        return createAccountList.stream().filter(c -> c.createNewAccount.firstName.equalsIgnoreCase(name)).findAny().get();
    }
}
