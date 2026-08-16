package br.edu.ifsp.scl.sc3039587.trucoscoreboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.scl.sc3039587.trucoscoreboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val activityMainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private var nosScore: Int = 0
    private var elesScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)

        with(activityMainBinding) {
            btNosIncrementar1.setOnClickListener {
                nosScore++
                tvNosCounter.text = nosScore.toString()
                verificarMaoDeOnze()
            }

            btNosIncrementar3.setOnClickListener {
                nosScore += 3
                tvNosCounter.text = nosScore.toString()
                verificarMaoDeOnze()
            }

            btElesIncrementar1.setOnClickListener {
                elesScore++
                tvElesCounter.text = elesScore.toString()
                verificarMaoDeOnze()
            }

            btElesIncrementar3.setOnClickListener {
                elesScore += 3
                tvElesCounter.text = elesScore.toString()
                verificarMaoDeOnze()
            }

            btReiniciar.setOnClickListener {
                nosScore = 0
                elesScore = 0
                tvNosCounter.text = "0"
                tvElesCounter.text = "0"
                tvStatus.text = ""
            }
        }
    }

    private fun verificarMaoDeOnze() {
        with(activityMainBinding) {
            when {
                nosScore == 11 -> {
                    tvStatus.text = "Mão de 11: Nós"
                }
                elesScore == 11 -> {
                    tvStatus.text = "Mão de 11: Eles"
                }
                else -> {
                    tvStatus.text = ""
                }
            }
        }
    }
}