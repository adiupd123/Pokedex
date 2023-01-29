package com.adiupd123.pokedex.data.remote.responses

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)