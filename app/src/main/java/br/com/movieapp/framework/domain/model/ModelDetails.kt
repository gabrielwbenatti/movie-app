package br.com.movieapp.framework.domain.model

data class ModelDetails(
    val id: Int,
    val title: String,
    val genres: List<String>,
    val overview: String,
    val backdropPathUrl: String?,
    val releaseDate: String?,
    val voteAverage: Double,
    val duration: Int = 0,
    val voteCount: Int = 0
)
