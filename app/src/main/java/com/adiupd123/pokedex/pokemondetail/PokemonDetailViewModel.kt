package com.adiupd123.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.adiupd123.pokedex.PokemonRepository
import com.adiupd123.pokedex.data.remote.responses.Pokemon
import com.adiupd123.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}