package com.example.scrubsup.data

import com.example.scrubsup.R
import com.example.scrubsup.model.Models

class Datasource(){
    fun loadModels3D(): List<Models> {
        return listOf(
            Models(
                R.string.brain,
                R.drawable.brain,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"human-brain\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/e073c2590bc24daaa7323f4daa5b7784/embed?autospin=1&autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>"
            ),
            Models(
                R.string.neuron,
                R.drawable.brain,//CHANGE
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"neuron network core\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\"  src=\"https://sketchfab.com/models/9b1af8411cf94819af3c60fef1ab6c36/embed?autostart=1&annotation_cycle=3\"> </iframe> </div></body></html>"
                    ),
            Models(
                R.string.heart,
                R.drawable.heart,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Realistic Human Heart\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/3f8072336ce94d18b3d0d055a1ece089/embed?autostart=1&ui_hint=0&ui_theme=dark\"> </iframe> </div></body></html>"
            ),
            Models(
                R.string.lungs,
                R.drawable.heart,//CHANGE
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Heart and lung animation\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\"  src=\"https://sketchfab.com/models/4fa8da9ce4b74764a37638b033ddbf2a/embed?autostart=1&annotations_visible=1&annotation_cycle=3&ui_infos=0&ui_watermark_link=0&ui_watermark=0\"> </iframe> </div></body></html>"
            )
        )
    }
    fun loadOneHtml(): Models {
        return Models(
            R.string.brain,
            R.drawable.brain,
            "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"human-brain\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/e073c2590bc24daaa7323f4daa5b7784/embed?autospin=1&autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>"
        )
    }
}

