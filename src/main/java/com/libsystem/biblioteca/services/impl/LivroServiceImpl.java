package com.libsystem.biblioteca.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.libsystem.biblioteca.dtos.LivroDetalhadoDto;
import com.libsystem.biblioteca.mappers.LivroMapper;
import com.libsystem.biblioteca.models.Autor;
import com.libsystem.biblioteca.models.Editora;
import com.libsystem.biblioteca.models.Livro;
import com.libsystem.biblioteca.repositories.AutorRepository;
import com.libsystem.biblioteca.repositories.EditoraRepository;
import com.libsystem.biblioteca.repositories.LivroRepository;
import com.libsystem.biblioteca.services.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	
	private final LivroMapper mapper = LivroMapper.INSTANCE; //o 'final' indica que nao vai ser alterado
	
	@Autowired
	private LivroRepository repository;
	
	@Autowired
	private AutorRepository autorRepository;
	
	@Autowired
	private EditoraRepository editoraRepository;
	
	@Override
	public ResponseEntity<List<LivroDetalhadoDto>> listarLivros(){
		List<Livro> livros = repository.findAll();
		return ResponseEntity.ok(mapper.paraDDto(livros));
	}
	
	@Override
	public Livro findById(@PathVariable Long id) {
		return repository.findById(id).get();
		
	}
	
	@Override
	public String deleteById(@PathVariable Long id) {
		repository.deleteById(id);
		return "Livro excluído com sucesso";
	}
	
	@Override
	public LivroDetalhadoDto detalhesLivro(@PathVariable Long id) {
		return mapper.paraDDto(repository.findById(id).get());
	}
	
	@Override
	public LivroDetalhadoDto create(Livro livro) {
//		Autor autorLivro = autorRepository.findById(livro.getAutor().getId()).orElseThrow(
//				() -> new RuntimeException("nao encotrnado...."));
		
//		autorLivro.setLivrosCad(autorLivro.getLivrosCad() + 1);
//		autorRepository.save(autorLivro);
		
		Livro newLivro = repository.save(livro);
		
		return mapper.paraDDto(newLivro);
	}

	@Override
	public Livro update(@PathVariable Long id, Livro editarLivro) {
		Livro livroEditado = repository.findById(id).get();
		Autor autorLivro = autorRepository.findById(editarLivro.getAutor().getId()).orElseThrow(
				() -> new RuntimeException("nao encotrnado...."));
		
		Editora editoraLivro = editoraRepository.findById(editarLivro.getEditora().getId()).orElseThrow(
				() -> new RuntimeException("nao encotrnado...."));
		
		livroEditado.setTitulo(editarLivro.getTitulo());
		livroEditado.setAnoPublicacao(editarLivro.getAnoPublicacao());
		livroEditado.setIsbn(editarLivro.getIsbn());
		livroEditado.setEdicao(editarLivro.getEdicao());
		livroEditado.setStatus(editarLivro.getStatus());
		livroEditado.setObs(editarLivro.getObs());
		livroEditado.setEstadoCons(editarLivro.getEstadoCons());
		
		livroEditado.setAutor(autorLivro);
		livroEditado.setEditora(editoraLivro);
		
		repository.save(livroEditado);
		
		return livroEditado;
	}
}
