package com.adiupd123.pokedex.data.remote.responses

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)