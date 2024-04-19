package com.example.scrubsup.data

import com.example.scrubsup.R
import com.example.scrubsup.model.Models
import com.example.scrubsup.model.Quiz

class Datasource(){

    val MAX_QUESTIONS = 5
    fun loadModels3D(): List<Models> {
        return listOf(
            Models(
                R.string.Arterial_vessel,
                R.drawable.blood,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Arterial vessel tour\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\"  src=\"https://sketchfab.com/models/246576050a644cb4ae16840922385e39/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.rbc, R.string.rbc_details),
                    Pair(R.string.wbc, R.string.wbc_details),
                    Pair(R.string.arteriole_wall, R.string.arteriole_wall_details)
                )),
            Models(
                R.string.Neuron,
                R.drawable.neuron,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Stellate Neuron Example 1\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/6ef85cb9061a4ef2abb9e87258c7d0fb/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.cell_body, R.string.cell_body_details),
                    Pair(R.string.myelin_sheath, R.string.myelin_sheath_details),
                    Pair(R.string.dendrite, R.string.dendrite_details),
                    Pair(R.string.axon, R.string.axon_details),
                    Pair(R.string.terminal, R.string.terminal_details),
                )),
            Models(
                R.string.heart,
                R.drawable.heart,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Anatomical Human Heart\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/e48637d3399a4e5184bdf169929dc36e/embed?autostart=1&annotations_visible=1\"> </iframe> </div></body></html>"
                ,listOf(
                    Pair(R.string.human_heart, R.string.human_heart_details),
                    Pair(R.string.mitral_valve, R.string.mitral_valve_details),
                    Pair(R.string.aortic_valve, R.string.aortic_valve_details),
                    Pair(R.string.choardae_endineae, R.string.choardae_endineae_details),
                    Pair(R.string.tricuspid_valve, R.string.tricuspid_valve_details),
                    Pair(R.string.pulmonary, R.string.pulmonary_details),
                    Pair(R.string.right_art, R.string.right_art_details),
                    Pair(R.string.right_ven, R.string.right_ven_details),
                    Pair(R.string.left_ven, R.string.left_ven_details),
                    Pair(R.string.left_art, R.string.left_art_details),
                )),
            Models(
                R.string.brain,
                R.drawable.brain,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"human-brain\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/e073c2590bc24daaa7323f4daa5b7784/embed?autospin=1&autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.frontal_lobe, R.string.frontal_lobe_details),
                    Pair(R.string.parietal_lobe, R.string.parietal_lobe_details),
                    Pair(R.string.temporal, R.string.temporal_details),
                    Pair(R.string.stem, R.string.stem_details),
                    Pair(R.string.occipital_lobe, R.string.occipital_lobe_details)
                    )),
            Models(
                R.string.eye,
                R.drawable.eye,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Human eye anatomy\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/5f741793c4654d14aa8257eec1f1a393/embed?autostart=1&annotations_visible=1&ui_animations=0&ui_infos=0&ui_stop=0&ui_inspector=0&ui_ar=0&ui_help=0&ui_settings=0&ui_vr=0&ui_fullscreen=0&ui_annotations=0&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.iris, R.string.iris_details),
                    Pair(R.string.ciliary, R.string.ciliary_details),
                    Pair(R.string.sclera, R.string.sclera_details),
                    )),
            Models(
                R.string.lungs,
                R.drawable.lungs,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"respiratory tract lung trachea\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/8d8eb15025684066aea7981c826f3c3f/embed?autostart=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.trac, R.string.trac_details),
                    Pair(R.string.prbr, R.string.prbr_details),
                    Pair(R.string.sclera, R.string.sclera_details),
                )),
            Models(
                R.string.skeleton,
                R.drawable.skeleton,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Human Trunk Skeleton\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/98738acf9ae749a99292c3dd2315d907/embed?autostart=1\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.ribs, R.string.ribs_details),
                    Pair(R.string.cervical_spine, R.string.cervical_spine_details),
                    Pair(R.string.sternum, R.string.sternum_details),
                )),
            Models(
                R.string.full_body,
                R.drawable.body,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Upper Body Anatomy\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"370\" height=\"750\" src=\"https://sketchfab.com/models/bd4aa30efaa0455eaf3b4d59e9fe9c65/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.lungs, R.string.lung_details),
                    Pair(R.string.heart, R.string.heart_details),
                    Pair(R.string.Trachea, R.string.Trachea_details),
                    Pair(R.string.brain, R.string.brrain_details),
                    Pair(R.string.pupil, R.string.pupil_details),
                ))
        )
    }

    fun loadQuizSubjet(): List<Models> {
        return listOf(
            Models(
                R.string.neurology,
                R.drawable.neuron,
                "",
                listOf()),
            Models(
                R.string.respiratory,
                R.drawable.lungs,
                "",
                listOf()),
        )
    }
    fun loadQuestions(): List<Quiz> {
        return listOf(
            Quiz(
                R.string.brain1,
                R.drawable.brain1,
                listOf(
                    Pair(R.string.brain1_1,false),
                    Pair(R.string.brain1_2,false),
                    Pair(R.string.brain1_3,true),
                    Pair(R.string.brain1_4,false),
                ),
                R.string.neurology
            ),  Quiz(
                R.string.brain2,
                R.drawable.brain2,
                listOf(
                    Pair(R.string.brain2_1,false),
                    Pair(R.string.brain2_2,false),
                    Pair(R.string.brain2_3,true),
                    Pair(R.string.brain2_4,false),
                ),
                R.string.neurology
            ),
            Quiz(
                R.string.brain3,
                R.drawable.brain3,
                listOf(
                    Pair(R.string.brain3_1,false),
                    Pair(R.string.brain3_2,true),
                    Pair(R.string.brain3_3,false),
                    Pair(R.string.brain3_4,false),
                ),
                R.string.neurology,
            ),
            Quiz(
                R.string.brain4,
                R.drawable.brain4,
                listOf(
                    Pair(R.string.brain4_1,false),
                    Pair(R.string.brain4_2,true),
                    Pair(R.string.brain4_3,false),
                    Pair(R.string.brain4_4,false),
                ),
                R.string.neurology,
            ),
            Quiz(
                R.string.brain5,
                R.drawable.brain5,
                listOf(
                    Pair(R.string.brain5_1,false),
                    Pair(R.string.brain5_2,true),
                    Pair(R.string.brain5_3,false),
                    Pair(R.string.brain5_4,false),
                ),
                R.string.neurology,
            ),
            Quiz(
                R.string.lungs1,
                R.drawable.lungs1_1,
                listOf(
                    Pair(R.string.lungs1_1,false),
                    Pair(R.string.lungs1_2,false),
                    Pair(R.string.lungs1_3,false),
                    Pair(R.string.lungs1_4,true),
                ),
                R.string.respiratory,
            ),
            Quiz(
                R.string.lungs2,
                R.drawable.lungs2,
                listOf(
                    Pair(R.string.lungs2_1,false),
                    Pair(R.string.lungs2_2,false),
                    Pair(R.string.lungs2_3,false),
                    Pair(R.string.lungs2_4,true),
                ),
                R.string.respiratory,
            ),
            Quiz(
                R.string.lungs3,
                R.drawable.lungs3,
                listOf(
                    Pair(R.string.lungs3_1,false),
                    Pair(R.string.lungs3_2,false),
                    Pair(R.string.lungs3_4,true),
                    Pair(R.string.lungs3_3,false),
                ),
                R.string.respiratory,
            ),
            Quiz(
                R.string.lungs4,
                R.drawable.lungs4,
                listOf(
                    Pair(R.string.lungs4_1,true),
                    Pair(R.string.lungs4_2,false),
                    Pair(R.string.lungs4_3,false),
                    Pair(R.string.lungs4_4,false),
                ),
                R.string.respiratory,
            ),
            Quiz(
                R.string.lungs5,
                R.drawable.lungs5,
                listOf(
                    Pair(R.string.lungs5_1,false),
                    Pair(R.string.lungs5_2,false),
                    Pair(R.string.lungs5_3,false),
                    Pair(R.string.lungs5_4,true),
                ),
                R.string.respiratory,
            ),
        )
    }
}