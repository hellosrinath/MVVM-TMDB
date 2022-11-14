package com.blogspot.hellosrinath.mvvm_tmdb.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.blogspot.hellosrinath.mvvm_tmdb.domain.usecase.GetArtistUseCase
import com.blogspot.hellosrinath.mvvm_tmdb.domain.usecase.UpdateArtistUseCase

class ArtistViewModel(
    private val getArtistUseCase: GetArtistUseCase,
    private val updateArtistUseCase: UpdateArtistUseCase
) : ViewModel() {
    fun getArtist() = liveData {
        val artistList = getArtistUseCase.execute()
        emit(artistList)
    }

    fun updateArtist() = liveData {
        val artistList = updateArtistUseCase.execute()
        emit(artistList)
    }
}