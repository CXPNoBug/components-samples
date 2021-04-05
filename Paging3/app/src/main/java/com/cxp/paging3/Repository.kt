package com.cxp.paging3

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.cxp.paging3.api.GitHubService
import com.cxp.paging3.model.Repo
import com.cxp.paging3.model.RepoResponse
import kotlinx.coroutines.flow.Flow

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/04/05
 *     desc   :
 *     version: 1.0
 * </pre>
 */
object Repository {

    private const val PAGE_SIZE = 20

    private val gitHubService = GitHubService.create()

    fun getPagingData(): Flow<PagingData<Repo>> {
        return Pager(config = PagingConfig(PAGE_SIZE),
            pagingSourceFactory = { RepoPagingSource(gitHubService) }
        ).flow
    }


}