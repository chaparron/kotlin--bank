package tv.codealong.tutorials.springboot.TheNewBoston.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import tv.codealong.tutorials.springboot.TheNewBoston.model.Bank
import tv.codealong.tutorials.springboot.TheNewBoston.service.BankService

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService){

    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String> = ResponseEntity(e.message, HttpStatus.NOT_FOUND)

    @GetMapping
    fun getBanks():Collection<Bank> = service.getBanks()

    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String):Bank = service.getBank(accountNumber)

}