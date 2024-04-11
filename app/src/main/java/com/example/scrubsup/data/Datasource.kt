package com.example.scrubsup.data

import com.example.scrubsup.R
import com.example.scrubsup.model.Models

class Datasource(){
    fun loadModels3D(): List<Models> {
        return listOf(
            Models(
                R.string.Arterial_vessel,
                R.drawable.blood,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Arterial vessel tour\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\"  src=\"https://sketchfab.com/models/246576050a644cb4ae16840922385e39/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>"
            ),
            Models(
                R.string.Neuron,
                R.drawable.neuron,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Neuron example1\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/fdf46286fb8c49a89100acc78b06f0c6/embed?autostart=1&ui_theme=dark\"> </iframe> </div></body></html>"
            ),
            Models(
                R.string.heart,
                R.drawable.heart,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Anatomical Human Heart\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/e48637d3399a4e5184bdf169929dc36e/embed?autostart=1&annotations_visible=1\"> </iframe> </div></body></html>"
            ),
            Models(
                R.string.brain,
                R.drawable.brain,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"human-brain\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/e073c2590bc24daaa7323f4daa5b7784/embed?autospin=1&autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>"
            ),
            Models(
                R.string.lungs,
                R.drawable.lungs,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"adult heart and lungs\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/be4465abad5b45529d586b7b07c1afc5/embed?autostart=1&annotations_visible=1\"></iframe> </div></body></html>"
            ),
            Models(
                R.string.skeleton,
                R.drawable.skeleton,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Human Trunk Skeleton\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/98738acf9ae749a99292c3dd2315d907/embed?autostart=1\"> </iframe> </div></body></html>"
            ),
            Models(
                R.string.full_body,
                R.drawable.body,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Animated Full Human Body Anatomy\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\"  src=\"https://sketchfab.com/models/9b0b079953b840bc9a13f524b60041e4/embed?autostart=1\"> </iframe> </div></body></html>"
            )
        )
    }
}

