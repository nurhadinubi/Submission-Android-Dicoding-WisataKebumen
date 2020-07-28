package com.nurhadi.wisatakebumen

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)
        val actionbar = supportActionBar
        actionbar!!.title ="Credit"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvLinkEP : TextView = findViewById(R.id.link_explore)
        val tvClass : TextView =findViewById(R.id.tv_class)
        val strLink:String ="Gambar sebagian besar diambil dari instagram @explore_kebumen. Icon by Freepik from Flaticon. Selain gambar Artikel diambil dari beberapa " +
                "website seperti Wikipedia, Javatravel, ihategreenjello. Anda dapat mengunjungi sumber assest dengan klik link yang bewarna merah muda\n" +
                "Semoga Aplikasi ini bermanfaat"
        val strClass ="Aplikasi ini dibuat sebagai syarat kelulusan kelas Belajar Membuat Aplikasi Android Pemula di Dicoding.\n" +
                "Kelas ini sangat bermanfaat karena Android merupakan sistem operasi yang sebagian besar masyarakat indonesia, sehingga mempunyai " +
                "potensi pasar yang luas. selain itu Android terbukti menjadi solusi permasalahan yang ada di masyarakat, sehingga bisa bermanfaat lebih luas"
        val ss2=SpannableString(strClass)
        val ss = SpannableString(strLink)
        val clickableSpan1: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val linkIgEK = "https://www.instagram.com/explore_kebumen/"
                val IntentEP = Intent(Intent.ACTION_VIEW, Uri.parse(linkIgEK))
                startActivity(IntentEP)
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
            }
        }

        val clickableSpan2: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val linkIgEK = "https://www.flaticon.com/authors/freepik"
                val IntentEP = Intent(Intent.ACTION_VIEW, Uri.parse(linkIgEK))
                startActivity(IntentEP)
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
            }
        }
        val clickableSpan3: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val linkIgEK = "https://www.flaticon.com/"
                val IntentEP = Intent(Intent.ACTION_VIEW, Uri.parse(linkIgEK))
                startActivity(IntentEP)
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
            }
        }
        val clickableSpan4: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val linkIgEK = "https://www.dicoding.com/academies/51"
                val IntentEP = Intent(Intent.ACTION_VIEW, Uri.parse(linkIgEK))
                startActivity(IntentEP)
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
            }
        }
        val clickableSpan5: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val linkIgEK = "https://www.wikipedia.org/"
                val IntentEP = Intent(Intent.ACTION_VIEW, Uri.parse(linkIgEK))
                startActivity(IntentEP)
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
            }
        }
        val clickableSpan6: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val linkIgEK = "https://www.javatravel.net/tempat-wisata-kebumen/"
                val IntentEP = Intent(Intent.ACTION_VIEW, Uri.parse(linkIgEK))
                startActivity(IntentEP)
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
            }
        }
        val clickableSpan7: ClickableSpan = object : ClickableSpan() {
            override fun onClick(p0: View) {
                val linkIgEK = "https://ihategreenjello.com/pesona-keindahan-wisata-alam-jembangan/"
                val IntentEP = Intent(Intent.ACTION_VIEW, Uri.parse(linkIgEK))
                startActivity(IntentEP)
            }
            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
            }
        }

        ss.setSpan(clickableSpan1, 46, 61, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(clickableSpan2, 71, 78, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(clickableSpan3, 84, 92, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(clickableSpan5, 154, 163, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(clickableSpan6, 165, 175, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        ss.setSpan(clickableSpan7, 177, 192, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        ss2.setSpan(clickableSpan4, 51, 102, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tvClass.text=ss2
        tvLinkEP.text = ss;
        tvLinkEP.movementMethod = LinkMovementMethod.getInstance();
        tvClass.movementMethod = LinkMovementMethod.getInstance();
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}