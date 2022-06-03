package com.noobdev.propermvvmarcitecture.repo
import com.noobdev.propermvvmarcitecture.domain.model.DomainParsableResponse
import com.noobdev.propermvvmarcitecture.network.model.ResponseDtoMapper
import javax.inject.Inject

class Repository_Impl constructor(
    private val apiService: ApiService,
    private val mapper: ResponseDtoMapper,
) : Repository.Repo{
    override suspend fun getDataRepo(limit: Int, offset: Int): DomainParsableResponse {
        val  result = apiService.getData(0,0)
        return mapper.mapToDomainModel(result)
    }


}