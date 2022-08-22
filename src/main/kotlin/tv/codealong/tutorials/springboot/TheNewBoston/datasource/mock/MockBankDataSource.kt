package tv.codealong.tutorials.springboot.TheNewBoston.datasource.mock

import org.springframework.stereotype.Repository
import tv.codealong.tutorials.springboot.TheNewBoston.datasource.BankDataSource
import tv.codealong.tutorials.springboot.TheNewBoston.model.Bank

@Repository
class MockBankDataSource: BankDataSource {
    val banks = listOf(
        Bank("654",2.0,18),
        Bank("1010",17.0,5),
        Bank("65444",2.0,1)
    )

    override fun retrieveBanks() : Collection<Bank> = banks

/*    override fun getBanks(): Collection<Bank> {
        return banks
    } */
}