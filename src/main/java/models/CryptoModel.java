package models;

import java.io.Serializable;

public class CryptoModel implements Serializable {	
	private String decryptKey;
	private String encryptKey;
	private String originalText;
	private String encryptedText;
	private String decryptedText;
	private String tobeDecryptedText;
	
	public String getTobeDecryptedText() {
		return tobeDecryptedText;
	}
	public void setTobeDecryptedText(String tobeDecryptedText) {
		this.tobeDecryptedText = tobeDecryptedText;
	}
	public String getDecryptKey() {
		return decryptKey;
	}
	public void setDecryptKey(String decryptKey) {
		this.decryptKey = decryptKey;
	}
	public String getEncryptKey() {
		return encryptKey;
	}
	public void setEncryptKey(String encryptKey) {
		this.encryptKey = encryptKey;
	}
	public String getOriginalText() {
		return originalText;
	}
	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}
	public String getEncryptedText() {
		return encryptedText;
	}
	public void setEncryptedText(String encryptedText) {
		this.encryptedText = encryptedText;
	}
	public String getDecryptedText() {
		return decryptedText;
	}
	public void setDecryptedText(String decryptedText) {
		this.decryptedText = decryptedText;
	}
	

}