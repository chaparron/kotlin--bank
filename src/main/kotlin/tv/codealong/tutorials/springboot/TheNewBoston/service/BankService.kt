package tv.codealong.tutorials.springboot.TheNewBoston.service

import org.springframework.stereotype.Service
import tv.codealong.tutorials.springboot.TheNewBoston.datasource.BankDataSource
import tv.codealong.tutorials.springboot.TheNewBoston.model.Bank

@Service
class BankService (private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}