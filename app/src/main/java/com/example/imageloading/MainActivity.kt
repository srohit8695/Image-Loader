package com.example.imageloading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.ImageLoader
import coil.api.load
import com.example.imageloading.databinding.ActivityMainBinding
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnParallel.setOnClickListener{
            runBlocking {
                withContext(Dispatchers.IO) {
                    executeParally()
                }
            }
        }

        binding.btnSequence.setOnClickListener{
            runBlocking {
                withContext(Dispatchers.IO) {
                    executeSequential()
                }
            }
        }
    }

    suspend fun executeParally(){

        coroutineScope {
            async {
                loadRow1()
                loadRow2()
                loadRow3()
                loadRow4()
                loadRow5()
            }
        }


    }

    suspend fun executeSequential(){

        coroutineScope {

            launch {
                loadRow1()
                loadRow2()
                loadRow3()
                loadRow4()
                loadRow5()
            }


        }


    }


     fun loadRow1(){
        binding.imageData1.load("https://via.placeholder.com/150/92c952").dispose()
        binding.imageData2.load("https://via.placeholder.com/150/771796").dispose()
        binding.imageData3.load("https://via.placeholder.com/150/24f355").dispose()
        binding.imageData4.load("https://via.placeholder.com/150/d32776").dispose()
        binding.imageData5.load("https://via.placeholder.com/150/f66b97").dispose()
        binding.imageData6.load("https://via.placeholder.com/150/56a8c2").dispose()
        binding.imageData7.load("https://via.placeholder.com/150/b0f7cc").dispose()
        binding.imageData8.load("https://via.placeholder.com/150/54176f").dispose()
        binding.imageData9.load("https://via.placeholder.com/150/51aa97").dispose()
        binding.imageData10.load("https://via.placeholder.com/150/810b14").dispose()
    }


    fun loadRow2(){
        binding.imageData20.load("https://via.placeholder.com/150/92c952")
        binding.imageData19.load("https://via.placeholder.com/150/771796")
        binding.imageData18.load("https://via.placeholder.com/150/24f355")
        binding.imageData17.load("https://via.placeholder.com/150/d32776")
        binding.imageData16.load("https://via.placeholder.com/150/f66b97")
        binding.imageData15.load("https://via.placeholder.com/150/56a8c2")
        binding.imageData14.load("https://via.placeholder.com/150/b0f7cc")
        binding.imageData13.load("https://via.placeholder.com/150/54176f")
        binding.imageData12.load("https://via.placeholder.com/150/51aa97")
        binding.imageData11.load("https://via.placeholder.com/150/810b14")
    }

    fun loadRow3(){
        binding.imageData21.load("https://via.placeholder.com/150/92c952")
        binding.imageData22.load("https://via.placeholder.com/150/771796")
        binding.imageData23.load("https://via.placeholder.com/150/24f355")
        binding.imageData24.load("https://via.placeholder.com/150/d32776")
        binding.imageData25.load("https://via.placeholder.com/150/f66b97")
        binding.imageData26.load("https://via.placeholder.com/150/56a8c2")
        binding.imageData27.load("https://via.placeholder.com/150/b0f7cc")
        binding.imageData28.load("https://via.placeholder.com/150/54176f")
        binding.imageData29.load("https://via.placeholder.com/150/51aa97")
        binding.imageData30.load("https://via.placeholder.com/150/810b14")
    }


    fun loadRow4(){
        binding.imageData40.load("https://via.placeholder.com/150/92c952")
        binding.imageData39.load("https://via.placeholder.com/150/771796")
        binding.imageData38.load("https://via.placeholder.com/150/24f355")
        binding.imageData37.load("https://via.placeholder.com/150/d32776")
        binding.imageData36.load("https://via.placeholder.com/150/f66b97")
        binding.imageData35.load("https://via.placeholder.com/150/56a8c2")
        binding.imageData34.load("https://via.placeholder.com/150/b0f7cc")
        binding.imageData33.load("https://via.placeholder.com/150/54176f")
        binding.imageData32.load("https://via.placeholder.com/150/51aa97")
        binding.imageData31.load("https://via.placeholder.com/150/810b14")
    }

    fun loadRow5(){
        binding.imageData41.load("https://via.placeholder.com/150/92c952")
        binding.imageData42.load("https://via.placeholder.com/150/771796")
        binding.imageData43.load("https://via.placeholder.com/150/24f355")
        binding.imageData44.load("https://via.placeholder.com/150/d32776")
        binding.imageData45.load("https://via.placeholder.com/150/f66b97")
        binding.imageData46.load("https://via.placeholder.com/150/56a8c2")
        binding.imageData47.load("https://via.placeholder.com/150/b0f7cc")
        binding.imageData48.load("https://via.placeholder.com/150/54176f")
        binding.imageData49.load("https://via.placeholder.com/150/51aa97")
        binding.imageData50.load("https://via.placeholder.com/150/810b14")
    }



}