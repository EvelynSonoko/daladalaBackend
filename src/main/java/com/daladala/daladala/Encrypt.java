package com.daladala.daladala;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
    public static byte[] digest(byte[] password){
        MessageDigest message;
        try{
            message=MessageDigest.getInstance("SHA-256");

        }catch (NoSuchAlgorithmException e){
            throw new IllegalArgumentException(e);
        }
        byte[]  encryptpass=message.digest(password);
        return encryptpass;

    }
    public static String bytesToMax(byte[] bytes){
        StringBuilder build =new StringBuilder();
        for(byte b:bytes){
            build.append(String.format("%02x",b));
        }
        return build.toString();
    }
}
