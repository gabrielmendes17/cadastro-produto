package br.com.gabriel.cadastroproduto.service;

import org.springframework.web.multipart.MultipartFile;

public interface IStorageService {
	void store(MultipartFile file);

}
