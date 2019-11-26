package services;

import org.springframework.stereotype.Service;

import aesAlgorithm.AES;


@Service
public class CryptoService {
	
	public String encryptText(String originalText,String key){
		String encryptedString = AES.encrypt(originalText, key);
		return encryptedString;
	}
	
	public String decryptText(String tobeDecryptedText,String key){
		String decryptedString = AES.decrypt(tobeDecryptedText, key);
		return decryptedString;
	}
	

}
