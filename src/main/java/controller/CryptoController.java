package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import models.CryptoModel;
import services.CryptoService;

@RestController
@RequestMapping(value="/ats")
public class CryptoController {
	
	@Autowired
	private CryptoService cryptoService;
	
	@RequestMapping(value="/encrypttext",method=RequestMethod.POST)
	public ResponseEntity<String> encryptText(@RequestBody CryptoModel cryptoModel) {
		String key=cryptoModel.getEncryptKey();
		String originalText=cryptoModel.getOriginalText();
		String encryptedText=cryptoService.encryptText(originalText,key);
	//	System.out.println(encryptedText);
		return new ResponseEntity<String>("{\"encryptedText\":\""+encryptedText+"\"}", HttpStatus.OK);
			 		
	}
	
	@RequestMapping(value="/decrypttext",method=RequestMethod.POST)
	public ResponseEntity<String> decryptText(@RequestBody CryptoModel cryptoModel) {
		String key=cryptoModel.getDecryptKey();
		String tobeDecryptedText=cryptoModel.getTobeDecryptedText();
		String decryptedText=cryptoService.decryptText(tobeDecryptedText, key);
	//	System.out.println(decryptedText);
		return new ResponseEntity<String>("{\"decryptedText\":\""+decryptedText+"\"}", HttpStatus.OK);
	
		
	}

}
