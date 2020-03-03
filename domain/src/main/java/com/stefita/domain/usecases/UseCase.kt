package com.stefita.domain.usecases

import com.stefita.domain.common.Result
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

abstract class UseCase<Type, in Params> where Type : Any {

    abstract suspend fun run(params: Params): Result<Type>

    operator fun invoke(params: Params, onResult: (Result<Type>) -> Unit = {}) {
        GlobalScope.launch {
            val result = run(params)
            onResult(result)
        }
    }

    class None
}