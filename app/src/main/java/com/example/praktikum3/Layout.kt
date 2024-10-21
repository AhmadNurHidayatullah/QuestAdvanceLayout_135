package com.example.praktikum3

import android.graphics.drawable.Icon
import android.preference.PreferenceActivity.Header
import android.telecom.Call.Details
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Layout(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()){
        HeaderSection2()
        DetailMhs(
            para = "Nama",
            arg =  "Ahmad Nur Hidayatullah"
        )
        DetailMhs(para = "NIM", arg = "20220140135")
        DetailMhs(para = "Prodi", arg = "S1-Teknologi Informasi")
        DetailMhs(para = "Fakultas", arg = "Teknik")
        DetailMhs(para = "Universitas", arg = "Universitas Muhammadiyah Yogyakarta")
        DetailMhs(para = "Alamat", arg = "Bantul")
        DetailMhs(para = "No.Tlpn", arg = "08256377463")
        DetailMhs(para = "Email", arg = "ahmadganteng@gmail.com")
        }
    }

@Composable
fun HeaderSection2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Box(
                modifier = Modifier.size(50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .align(Alignment.BottomEnd)
                        .offset(x = (-4).dp, y = (-4).dp)
                )
            }

            Column(
                modifier = Modifier
                    .padding(start = 20.dp)
            ) {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}


@Composable
fun DetailMhs(
    para:String,arg:String
){
    Column (modifier = Modifier.padding(16.dp)) {
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween){
            Text(text = para, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.1f))
            Text(text = arg, modifier = Modifier.weight(2f))
        }
    }
}