package br.com.gabriel.cadastroproduto.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService implements IStorageService{

    public void store(MultipartFile file) {
    	try {
    		File tmpFile = new File("F:\\Users\\BFBK\\"+file.getOriginalFilename());
			if(tmpFile.createNewFile());
    			file.transferTo(tmpFile);
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}