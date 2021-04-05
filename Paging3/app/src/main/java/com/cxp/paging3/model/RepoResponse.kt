package com.cxp.paging3.model

import com.google.gson.annotations.SerializedName

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/04/05
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class RepoResponse(
    @SerializedName("items") val items: List<Repo> = emptyList()
)