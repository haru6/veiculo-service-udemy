package br.com.curso.controller

import br.com.curso.model.Veiculo
import br.com.curso.service.VeiculoService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*

@Controller("/veiculos")
class VeiculoController(private val veiculoService: VeiculoService) {

    @Post
    fun save(@Body veiculo: Veiculo): HttpResponse<Veiculo>{
        return HttpResponse.created(veiculoService.saveVeiculo(veiculo))
    }

    @Get("/{id}")
    fun findOne(@PathVariable id: Long): HttpResponse<Veiculo>{
        return HttpResponse.ok(veiculoService.getVeiculo(id))
    }
}