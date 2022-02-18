package com.example.part4_chapter1.service

import com.example.part4_chapter1.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("v3/f7ec94b1-4ea4-4696-b2ce-5eaa85461630")
    fun listVideos():Call<VideoDto>
}