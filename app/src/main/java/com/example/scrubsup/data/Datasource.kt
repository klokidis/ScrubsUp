package com.example.scrubsup.data

import com.example.scrubsup.R
import com.example.scrubsup.model.Models

class Datasource(){
    fun loadModels(): List<Models> {
        return listOf(
            Models(
                R.string.brain,
                R.drawable.brain,
                ""//FILL THIS LATER
            ),
            Models(
                R.string.heart,
                R.drawable.heart,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Realistic Human Heart\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/3f8072336ce94d18b3d0d055a1ece089/embed?autostart=1&ui_hint=0&ui_theme=dark\"> </iframe> </div></body></html>"
            )
        )
    }
    fun loadOneHtml(): Models {
        return Models(
            R.string.heart,
            R.drawable.heart,
            "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Realistic Human Heart\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/3f8072336ce94d18b3d0d055a1ece089/embed?autostart=1&ui_hint=0&ui_theme=dark\"> </iframe> </div></body></html>"
        )
    }
}

