package br.com.curso.service

import br.com.curso.model.Veiculo
import br.com.curso.repository.VeiculoRepository
import jakarta.inject.Singleton

@Singleton
class VeiculoService (private val veiculoRepository: VeiculoRepository){

    fun saveVeiculo(veiculo: Veiculo): Veiculo{
        return veiculoRepository.save(veiculo)
    }

    fun getVeiculo(id: Long): Veiculo{
        return veiculoRepository.findById(id).get();
    }
}