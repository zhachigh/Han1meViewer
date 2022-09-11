package com.yenaly.han1meviewer.logic.network

import com.yenaly.han1meviewer.logic.model.VersionModel
import retrofit2.http.GET

/**
 * @project Han1meViewer
 * @author Yenaly Liew
 * @time 2022/09/09 009 20:04
 */
interface VersionService {
    @GET("repos/YenalyLiew/Han1meViewer/releases/latest")
    suspend fun getLatestVersion(): VersionModel
}