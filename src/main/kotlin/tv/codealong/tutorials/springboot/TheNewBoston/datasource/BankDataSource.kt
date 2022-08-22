package tv.codealong.tutorials.springboot.TheNewBoston.datasource
import tv.codealong.tutorials.springboot.TheNewBoston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

}