package com.example.scrubsup.data

import com.example.scrubsup.R
import com.example.scrubsup.model.Cards
import com.example.scrubsup.model.Models
import com.example.scrubsup.model.Quiz

class Datasource(){

    val MAX_QUESTIONS = 5
    fun loadModels3D(): List<Models> {
        return listOf(
            Models(
                R.string.Arterial_vessel,
                R.drawable.blood,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Arterial vessel tour\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\"  src=\"https://sketchfab.com/models/246576050a644cb4ae16840922385e39/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.rbc, R.string.rbc_details),
                    Pair(R.string.wbc, R.string.wbc_details),
                    Pair(R.string.arteriole_wall, R.string.arteriole_wall_details)
                )),
            Models(
                R.string.Neuron,
                R.drawable.neuron,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Stellate Neuron Example 1\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\" src=\"https://sketchfab.com/models/6ef85cb9061a4ef2abb9e87258c7d0fb/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
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
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Anatomical Human Heart\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\" src=\"https://sketchfab.com/models/e48637d3399a4e5184bdf169929dc36e/embed?autostart=1&annotations_visible=1\"> </iframe> </div></body></html>"
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
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"human-brain\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\" src=\"https://sketchfab.com/models/e073c2590bc24daaa7323f4daa5b7784/embed?autospin=1&autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
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
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Human eye anatomy\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\" src=\"https://sketchfab.com/models/5f741793c4654d14aa8257eec1f1a393/embed?autostart=1&annotations_visible=1&ui_animations=0&ui_infos=0&ui_stop=0&ui_inspector=0&ui_ar=0&ui_help=0&ui_settings=0&ui_vr=0&ui_fullscreen=0&ui_annotations=0&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.iris, R.string.iris_details),
                    Pair(R.string.ciliary, R.string.ciliary_details),
                    Pair(R.string.sclera, R.string.sclera_details),
                    )),
            Models(
                R.string.lungs,
                R.drawable.lungs,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"respiratory tract lung trachea\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\" src=\"https://sketchfab.com/models/8d8eb15025684066aea7981c826f3c3f/embed?autostart=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.trac, R.string.trac_details),
                    Pair(R.string.prbr, R.string.prbr_details),
                    Pair(R.string.sclera, R.string.sclera_details),
                )),
            Models(
                R.string.skeleton,
                R.drawable.skeleton,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Human Trunk Skeleton\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\" src=\"https://sketchfab.com/models/98738acf9ae749a99292c3dd2315d907/embed?autostart=1\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.ribs, R.string.ribs_details),
                    Pair(R.string.cervical_spine, R.string.cervical_spine_details),
                    Pair(R.string.sternum, R.string.sternum_details),
                )),
            Models(
                R.string.full_body,
                R.drawable.body,
                "<html><body style='margin:0;padding:0;'><div class=\"sketchfab-embed-wrapper\"> <iframe title=\"Upper Body Anatomy\" frameborder=\"0\" allowfullscreen mozallowfullscreen=\"true\" webkitallowfullscreen=\"true\" allow=\"autoplay; fullscreen; xr-spatial-tracking\" xr-spatial-tracking execution-while-out-of-viewport execution-while-not-rendered web-share width=\"384\" height=\"750\" src=\"https://sketchfab.com/models/bd4aa30efaa0455eaf3b4d59e9fe9c65/embed?autostart=1&annotations_visible=1&ui_theme=dark\"> </iframe> </div></body></html>",
                listOf(
                    Pair(R.string.lungs, R.string.lung_details),
                    Pair(R.string.heart, R.string.heart_details),
                    Pair(R.string.Trachea, R.string.Trachea_details),
                    Pair(R.string.brain, R.string.brrain_details),
                    Pair(R.string.pupil, R.string.pupil_details),
                ))
        )
    }

    fun loadQuizSubject(): List<Models> {
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
            Models(
                R.string.wholeskeleton,
                R.drawable.wholeskeleton,
                "",
                listOf()),
            Models(
                R.string.upperlimb,
                R.drawable.upper_limb,
                "",
                listOf()),
            Models(
                R.string.lowerlimb,
                R.drawable.lower,
                "",
                listOf()),
        )
    }
    
    fun loadCardSubject(): List<Models> {
        return listOf(
            Models(
                R.string.Arterial_vessel,
                R.drawable.blood,
                "",
                listOf()),
            Models(
                R.string.Neuron,
                R.drawable.neuron,
                "",
                listOf()),
            Models(
                R.string.heart,
                R.drawable.heart,
                "",
                listOf()),
            Models(
                R.string.brain,
                R.drawable.brain,
                "",
                listOf()),
            Models(
                R.string.eye,
                R.drawable.eye,
                "",
                listOf()),
            Models(
                R.string.lungs,
                R.drawable.lungs,
                "",
                listOf()),
            Models(
                R.string.skeleton,
                R.drawable.skeleton,
                "",
                listOf()),
            Models(
                R.string.full_body,
                R.drawable.body,
                "",
                listOf())
        )
    }

    fun loadCardQuestions(): List<Cards> {
        return listOf(
            Cards(
                R.string.artv_q1,
                R.drawable.image_8,
                R.string.artv_a1,
                R.string.Arterial_vessel
            ),
            Cards(
                R.string.artv_q2,
                R.drawable.image_8,
                R.string.artv_a2,
                R.string.Arterial_vessel
            ),
            Cards(
                R.string.artv_q3,
                R.drawable.image_8,
                R.string.artv_a3,
                R.string.Arterial_vessel
            ),
            Cards(
                R.string.artv_q4,
                R.drawable.image_8,
                R.string.artv_a4,
                R.string.Arterial_vessel
            ),
            Cards(
                R.string.artv_q5,
                R.drawable.image_8,
                R.string.artv_a5,
                R.string.Arterial_vessel
            ),
            Cards(
                R.string.artv_q6,
                R.drawable.image_8,
                R.string.artv_a6,
                R.string.Arterial_vessel
            ),
            Cards(
                R.string.artv_q7,
                R.drawable.image_8,
                R.string.artv_a7,
                R.string.Arterial_vessel
            ),
            Cards(
                R.string.neur_q1,
                R.drawable.image_7,
                R.string.neur_a1,
                R.string.Neuron
            ),
            Cards(
                R.string.neur_q2,
                R.drawable.image_7,
                R.string.neur_a2,
                R.string.Neuron
            ),
            Cards(
                R.string.neur_q3,
                R.drawable.image_7,
                R.string.neur_a3,
                R.string.Neuron
            ),
            Cards(
                R.string.neur_q4,
                R.drawable.image_7,
                R.string.neur_a4,
                R.string.Neuron
            ),
            Cards(
                R.string.neur_q5,
                R.drawable.image_7,
                R.string.neur_a5,
                R.string.Neuron
            ),
            Cards(
                R.string.neur_q6,
                R.drawable.image_7,
                R.string.neur_a6,
                R.string.Neuron
            ),
            Cards(
                R.string.neur_q7,
                R.drawable.image_7,
                R.string.neur_a7,
                R.string.Neuron
            ),
            Cards(
                R.string.heart_q1,
                R.drawable.image_3,
                R.string.heart_a1,
                R.string.heart
            ),
            Cards(
                R.string.heart_q2,
                R.drawable.image_3,
                R.string.heart_a2,
                R.string.heart
            ),
            Cards(
                R.string.heart_q3,
                R.drawable.image_3,
                R.string.heart_a3,
                R.string.heart
            ),
            Cards(
                R.string.heart_q4,
                R.drawable.image_3,
                R.string.heart_a4,
                R.string.heart
            ),
            Cards(
                R.string.heart_q5,
                R.drawable.image_3,
                R.string.heart_a5,
                R.string.heart
            ),
            Cards(
                R.string.heart_q6,
                R.drawable.image_3,
                R.string.heart_a6,
                R.string.heart
            ),
            Cards(
                R.string.heart_q7,
                R.drawable.image_3,
                R.string.heart_a7,
                R.string.heart
            ),
            Cards(
                R.string.brain_q1,
                R.drawable.image_1,
                R.string.brain_a1,
                R.string.brain
            ),
            Cards(
                R.string.brain_q2,
                R.drawable.image_1,
                R.string.brain_a2,
                R.string.brain
            ),
            Cards(
                R.string.brain_q3,
                R.drawable.image_1,
                R.string.brain_a3,
                R.string.brain
            ),
            Cards(
                R.string.brain_q4,
                R.drawable.image_1,
                R.string.brain_a4,
                R.string.brain
            ),
            Cards(
                R.string.brain_q5,
                R.drawable.image_1,
                R.string.brain_a5,
                R.string.brain
            ),
            Cards(
                R.string.brain_q6,
                R.drawable.image_1,
                R.string.brain_a6,
                R.string.brain
            ),
            Cards(
                R.string.brain_q7,
                R.drawable.image_1,
                R.string.brain_a7,
                R.string.brain
            ),
            Cards(
                R.string.eye_q1,
                R.drawable.image_5,
                R.string.eye_a1,
                R.string.eye
            ),
            Cards(
                R.string.eye_q2,
                R.drawable.image_5,
                R.string.eye_a2,
                R.string.eye
            ),
            Cards(
                R.string.eye_q3,
                R.drawable.image_5,
                R.string.eye_a3,
                R.string.eye
            ),
            Cards(
                R.string.eye_q4,
                R.drawable.image_5,
                R.string.eye_a4,
                R.string.eye
            ),
            Cards(
                R.string.eye_q5,
                R.drawable.image_5,
                R.string.eye_a5,
                R.string.eye
            ),
            Cards(
                R.string.eye_q6,
                R.drawable.image_5,
                R.string.eye_a6,
                R.string.eye
            ),
            Cards(
                R.string.eye_q7,
                R.drawable.image_5,
                R.string.eye_a7,
                R.string.eye
            ),
            Cards(
                R.string.lungs_q1,
                R.drawable.image_4,
                R.string.lungs_a1,
                R.string.lungs
            ),
            Cards(
                R.string.lungs_q2,
                R.drawable.image_4,
                R.string.lungs_a2,
                R.string.lungs
            ),
            Cards(
                R.string.lungs_q3,
                R.drawable.image_4,
                R.string.lungs_a3,
                R.string.lungs
            ),
            Cards(
                R.string.lungs_q4,
                R.drawable.image_4,
                R.string.lungs_a4,
                R.string.lungs
            ),
            Cards(
                R.string.lungs_q5,
                R.drawable.image_4,
                R.string.lungs_a5,
                R.string.lungs
            ),
            Cards(
                R.string.lungs_q6,
                R.drawable.image_4,
                R.string.lungs_a6,
                R.string.lungs
            ),
            Cards(
                R.string.lungs_q7,
                R.drawable.image_4,
                R.string.lungs_a7,
                R.string.lungs
            ),
            Cards(
                R.string.sk_q1,
                R.drawable.image_2,
                R.string.sk_a1,
                R.string.skeleton
            ),
            Cards(
                R.string.sk_q2,
                R.drawable.image_2,
                R.string.sk_a2,
                R.string.skeleton
            ),
            Cards(
                R.string.sk_q3,
                R.drawable.image_2,
                R.string.sk_a3,
                R.string.skeleton
            ),
            Cards(
                R.string.sk_q4,
                R.drawable.image_2,
                R.string.sk_a4,
                R.string.skeleton
            ),
            Cards(
                R.string.sk_q5,
                R.drawable.image_2,
                R.string.sk_a5,
                R.string.skeleton
            ),
            Cards(
                R.string.sk_q6,
                R.drawable.image_2,
                R.string.sk_a6,
                R.string.skeleton
            ),
            Cards(
                R.string.sk_q7,
                R.drawable.image_2,
                R.string.sk_a7,
                R.string.skeleton
            ),
            Cards(
                R.string.fl_q1,
                R.drawable.image_6,
                R.string.fl_a1,
                R.string.full_body
            ),
            Cards(
                R.string.fl_q2,
                R.drawable.image_6,
                R.string.fl_a2,
                R.string.full_body
            ),
            Cards(
                R.string.fl_q3,
                R.drawable.image_6,
                R.string.fl_a3,
                R.string.full_body
            ),
            Cards(
                R.string.fl_q4,
                R.drawable.image_6,
                R.string.fl_a4,
                R.string.full_body
            ),
            Cards(
                R.string.fl_q5,
                R.drawable.image_6,
                R.string.fl_a5,
                R.string.full_body
            ),
            Cards(
                R.string.fl_q6,
                R.drawable.image_6,
                R.string.fl_a6,
                R.string.full_body
            ),
            Cards(
                R.string.fl_q7,
                R.drawable.image_6,
                R.string.fl_a7,
                R.string.full_body
            ),
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
            Quiz(
                R.string.skeleton1,
                R.drawable.skeleton1,
                listOf(
                    Pair(R.string.skeleton1_1,false),
                    Pair(R.string.skeleton1_2,true),
                ),
                R.string.wholeskeleton,
            ),
            Quiz(
                R.string.skeleton2,
                R.drawable.skeleton2,
                listOf(
                    Pair(R.string.skeleton2_1,true),
                    Pair(R.string.skeleton2_2,false),
                ),
                R.string.wholeskeleton,
            ),
            Quiz(
                R.string.skeleton3,
                R.drawable.skeleton3,
                listOf(
                    Pair(R.string.skeleton3_1,true),
                    Pair(R.string.skeleton3_2,false),
                ),
                R.string.wholeskeleton,
            ),
            Quiz(
                R.string.skeleton4,
                R.drawable.skeleton4,
                listOf(
                    Pair(R.string.skeleton4_1,true),
                    Pair(R.string.skeleton4_2,false),
                ),
                R.string.wholeskeleton,
            ),
            Quiz(
                R.string.skeleton5,
                R.drawable.skeleton5,
                listOf(
                    Pair(R.string.skeleton5_1,false),
                    Pair(R.string.skeleton5_2,true),
                ),
                R.string.wholeskeleton,
            ),
            Quiz(
                R.string.upper1,
                R.drawable.upperlimb1,
                listOf(
                    Pair(R.string.upper1_1,true),
                    Pair(R.string.upper1_2,false),
                ),
                R.string.upperlimb,
            ),
            Quiz(
                R.string.upper2,
                R.drawable.upperlimb2,
                listOf(
                    Pair(R.string.upper2_1,false),
                    Pair(R.string.upper2_2,true),
                ),
                R.string.upperlimb,
            ),
            Quiz(
                R.string.upper3,
                R.drawable.upperlimb3,
                listOf(
                    Pair(R.string.upper3_1,false),
                    Pair(R.string.upper3_2,true),
                ),
                R.string.upperlimb,
            ),
            Quiz(
                R.string.upper4,
                R.drawable.upperlimb4,
                listOf(
                    Pair(R.string.upper4_1,true),
                    Pair(R.string.upper4_2,false),
                ),
                R.string.upperlimb,
            ),
            Quiz(
                R.string.upper5,
                R.drawable.upperlimb5,
                listOf(
                    Pair(R.string.upper5_1,true),
                    Pair(R.string.upper5_2,false),
                ),
                R.string.upperlimb,
            ),
            Quiz(
                R.string.lower1,
                R.drawable.lowerlimb1,
                listOf(
                    Pair(R.string.lower1_1,false),
                    Pair(R.string.lower1_2,true),
                ),
                R.string.lowerlimb,
            ),
            Quiz(
                R.string.lower2,
                R.drawable.lowerlimb2,
                listOf(
                    Pair(R.string.lower2_1,true),
                    Pair(R.string.lower2_2,false),
                ),
                R.string.lowerlimb,
            ),
            Quiz(
                R.string.lower3,
                R.drawable.lowerlimb3,
                listOf(
                    Pair(R.string.lower3_1,true),
                    Pair(R.string.lower3_2,false),
                ),
                R.string.lowerlimb,
            ),
            Quiz(
                R.string.lower4,
                R.drawable.lowerlimb4,
                listOf(
                    Pair(R.string.lower4_1,false),
                    Pair(R.string.lower4_2,true),
                ),
                R.string.lowerlimb,
            ),
            Quiz(
                R.string.lower5,
                R.drawable.lowerlimb5,
                listOf(
                    Pair(R.string.lower5_1,true),
                    Pair(R.string.lower5_2,false),
                ),
                R.string.lowerlimb,
            ),
        )
    }
}