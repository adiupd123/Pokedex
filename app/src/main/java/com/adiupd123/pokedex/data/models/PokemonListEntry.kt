package com.adiupd123.pokedex.data.models

class PokemonListEntry {
    data class PokedexListEntry(
        val pokemonName: String,
        val imageUrl: String,
        val number: Int
    )
}