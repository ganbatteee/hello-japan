package edu.hanu.a1_2001040209;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView alpha;
    private LinearLayout sv;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton aH, iH, uH, eH, oH, kaH, kiH, kuH, keH, koH, saH, shiH, suH, seH, soH, taH, chiH, tsuH, teH, toH,
                naH, niH, nuH, neH, noH, haH, hiH, fuH, heH, hoH, maH, miH, muH, meH, moH, yaH, yuH, yoH, raH, riH, ruH, reH, roH,
                waH, woH, nH, aK, iK, uK, eK, oK, kaK, kiK, kuK, keK, koK, saK, shiK, suK, seK, soK, taK, chiK, tsuK, teK, toK, naK,
                niK, nuK, neK, noK, haK, hiK, fuK, heK, hoK, maK, miK, muK, meK, moK, yaK, yuK, yoK, raK, riK, ruK, reK, roK, waK, woK, nK;


        aH = findViewById(R.id.btn_a_h);
        aH.setOnClickListener(this);
        iH = findViewById(R.id.btn_i_h);
        iH.setOnClickListener(this);
        uH = findViewById(R.id.btn_u_h);
        uH.setOnClickListener(this);
        eH = findViewById(R.id.btn_e_h);
        eH.setOnClickListener(this);
        oH = findViewById(R.id.btn_o_h);
        oH.setOnClickListener(this);

        kaH = findViewById(R.id.btn_ka_h);
        kaH.setOnClickListener(this);
        kiH = findViewById(R.id.btn_ki_h);
        kiH.setOnClickListener(this);
        kuH = findViewById(R.id.btn_ku_h);
        kuH.setOnClickListener(this);
        keH = findViewById(R.id.btn_ke_h);
        keH.setOnClickListener(this);
        koH = findViewById(R.id.btn_ko_h);
        koH.setOnClickListener(this);

        saH = findViewById(R.id.btn_sa_h);
        saH.setOnClickListener(this);
        shiH = findViewById(R.id.btn_shi_h);
        shiH.setOnClickListener(this);
        suH = findViewById(R.id.btn_su_h);
        suH.setOnClickListener(this);
        seH = findViewById(R.id.btn_se_h);
        seH.setOnClickListener(this);
        soH = findViewById(R.id.btn_so_h);
        soH.setOnClickListener(this);

        taH = findViewById(R.id.btn_ta_h);
        taH.setOnClickListener(this);
        chiH = findViewById(R.id.btn_chi_h);
        chiH.setOnClickListener(this);
        tsuH = findViewById(R.id.btn_tsu_h);
        tsuH.setOnClickListener(this);
        teH = findViewById(R.id.btn_te_h);
        teH.setOnClickListener(this);
        toH = findViewById(R.id.btn_to_h);
        toH.setOnClickListener(this);

        naH = findViewById(R.id.btn_na_h);
        naH.setOnClickListener(this);
        niH = findViewById(R.id.btn_ni_h);
        niH.setOnClickListener(this);
        nuH = findViewById(R.id.btn_nu_h);
        nuH.setOnClickListener(this);
        neH = findViewById(R.id.btn_ne_h);
        neH.setOnClickListener(this);
        noH = findViewById(R.id.btn_no_h);
        noH.setOnClickListener(this);

        haH = findViewById(R.id.btn_ha_h);
        haH.setOnClickListener(this);
        hiH = findViewById(R.id.btn_hi_h);
        hiH.setOnClickListener(this);
        fuH = findViewById(R.id.btn_fu_h);
        fuH.setOnClickListener(this);
        heH = findViewById(R.id.btn_he_h);
        heH.setOnClickListener(this);
        hoH = findViewById(R.id.btn_ho_h);
        hoH.setOnClickListener(this);

        maH = findViewById(R.id.btn_ma_h);
        maH.setOnClickListener(this);
        miH = findViewById(R.id.btn_mi_h);
        miH.setOnClickListener(this);
        muH = findViewById(R.id.btn_mu_h);
        muH.setOnClickListener(this);
        meH = findViewById(R.id.btn_me_h);
        meH.setOnClickListener(this);
        moH = findViewById(R.id.btn_mo_h);
        moH.setOnClickListener(this);

        yaH = findViewById(R.id.btn_ya_h);
        yaH.setOnClickListener(this);
        yuH = findViewById(R.id.btn_yu_h);
        yuH.setOnClickListener(this);
        yoH = findViewById(R.id.btn_yo_h);
        yoH.setOnClickListener(this);

        raH = findViewById(R.id.btn_ra_h);
        raH.setOnClickListener(this);
        riH = findViewById(R.id.btn_ri_h);
        riH.setOnClickListener(this);
        ruH = findViewById(R.id.btn_ru_h);
        ruH.setOnClickListener(this);
        reH = findViewById(R.id.btn_re_h);
        reH.setOnClickListener(this);
        roH = findViewById(R.id.btn_ro_h);
        roH.setOnClickListener(this);

        waH = findViewById(R.id.btn_wa_h);
        waH.setOnClickListener(this);
        woH = findViewById(R.id.btn_wo_h);
        woH.setOnClickListener(this);
        nH = findViewById(R.id.btn_n_h);
        nH.setOnClickListener(this);

        aK = findViewById(R.id.btn_a_k);
        aK.setOnClickListener(this);
        iK = findViewById(R.id.btn_i_k);
        iK.setOnClickListener(this);
        uK = findViewById(R.id.btn_u_k);
        uK.setOnClickListener(this);
        eK = findViewById(R.id.btn_e_k);
        eK.setOnClickListener(this);
        oK = findViewById(R.id.btn_o_k);
        oK.setOnClickListener(this);

        kaK = findViewById(R.id.btn_ka_k);
        kaK.setOnClickListener(this);
        kiK = findViewById(R.id.btn_ki_k);
        kiK.setOnClickListener(this);
        kuK = findViewById(R.id.btn_ku_k);
        kuK.setOnClickListener(this);
        keK = findViewById(R.id.btn_ke_k);
        keK.setOnClickListener(this);
        koK = findViewById(R.id.btn_ko_k);
        koK.setOnClickListener(this);

        saK = findViewById(R.id.btn_sa_k);
        saK.setOnClickListener(this);
        shiK = findViewById(R.id.btn_shi_k);
        shiK.setOnClickListener(this);
        suK = findViewById(R.id.btn_su_k);
        suK.setOnClickListener(this);
        seK = findViewById(R.id.btn_se_k);
        seK.setOnClickListener(this);
        soK = findViewById(R.id.btn_so_k);
        soK.setOnClickListener(this);

        taK = findViewById(R.id.btn_ta_k);
        taK.setOnClickListener(this);
        chiK = findViewById(R.id.btn_chi_k);
        chiK.setOnClickListener(this);
        tsuK = findViewById(R.id.btn_tsu_k);
        tsuK.setOnClickListener(this);
        teK = findViewById(R.id.btn_te_k);
        teK.setOnClickListener(this);
        toK = findViewById(R.id.btn_to_k);
        toK.setOnClickListener(this);

        naK = findViewById(R.id.btn_na_k);
        naK.setOnClickListener(this);
        niK = findViewById(R.id.btn_ni_k);
        niK.setOnClickListener(this);
        nuK = findViewById(R.id.btn_nu_k);
        nuK.setOnClickListener(this);
        neK = findViewById(R.id.btn_ne_k);
        neK.setOnClickListener(this);
        noK = findViewById(R.id.btn_no_k);
        noK.setOnClickListener(this);

        haK = findViewById(R.id.btn_ha_k);
        haK.setOnClickListener(this);
        hiK = findViewById(R.id.btn_hi_k);
        hiK.setOnClickListener(this);
        fuK = findViewById(R.id.btn_fu_k);
        fuK.setOnClickListener(this);
        heK = findViewById(R.id.btn_he_k);
        heK.setOnClickListener(this);
        hoK = findViewById(R.id.btn_ho_k);
        hoK.setOnClickListener(this);

        maK = findViewById(R.id.btn_ma_k);
        maK.setOnClickListener(this);
        miK = findViewById(R.id.btn_mi_k);
        miK.setOnClickListener(this);
        muK = findViewById(R.id.btn_mu_k);
        muK.setOnClickListener(this);
        meK = findViewById(R.id.btn_me_k);
        meK.setOnClickListener(this);
        moK = findViewById(R.id.btn_mo_k);
        moK.setOnClickListener(this);

        yaK = findViewById(R.id.btn_ya_k);
        yaK.setOnClickListener(this);
        yuK = findViewById(R.id.btn_yu_k);
        yuK.setOnClickListener(this);
        yoK = findViewById(R.id.btn_yo_k);
        yoK.setOnClickListener(this);

        raK = findViewById(R.id.btn_ra_k);
        raK.setOnClickListener(this);
        riK = findViewById(R.id.btn_ri_k);
        riK.setOnClickListener(this);
        ruK = findViewById(R.id.btn_ru_k);
        ruK.setOnClickListener(this);
        reK = findViewById(R.id.btn_re_k);
        reK.setOnClickListener(this);
        roK = findViewById(R.id.btn_ro_k);
        roK.setOnClickListener(this);

        waK = findViewById(R.id.btn_wa_k);
        waK.setOnClickListener(this);
        woK = findViewById(R.id.btn_wo_k);
        woK.setOnClickListener(this);
        nK = findViewById(R.id.btn_n_k);
        nK.setOnClickListener(this);

        Button btnHiragana = findViewById(R.id.btnHiragana);
        Button btnKatakana = findViewById(R.id.btnKatakana);

        TextView alphaHiragana = findViewById(R.id.alphaHiragana);
        TextView alphaKatakana = findViewById(R.id.alphaKatakana);

        LinearLayout svHiragana = findViewById(R.id.svHiragana);
        LinearLayout svKatakana = findViewById(R.id.svKatakana);

        alpha = alphaHiragana;
        sv = svHiragana;

        btnHiragana.setOnClickListener(view -> {
            btnKatakana.setBackgroundColor(Color.WHITE);
            btnHiragana.setBackgroundColor(Color.parseColor("#A103A9F4"));


            alphaHiragana.animate().alpha(1).setDuration(500);
            svHiragana.animate().alpha(1).setDuration(500);
            svHiragana.setVisibility(View.VISIBLE);

            alphaKatakana.animate().alpha(0).setDuration(500);
            svKatakana.animate().alpha(0).setDuration(500);
            svKatakana.setVisibility(View.GONE);

            alpha = alphaHiragana;
            sv = svHiragana;
        });
        btnKatakana.setOnClickListener(view -> {
            btnHiragana.setBackgroundColor(Color.WHITE);
            btnKatakana.setBackgroundColor(Color.parseColor("#A103A9F4"));


            alphaHiragana.animate().alpha(0).setDuration(500);
            svHiragana.animate().alpha(0).setDuration(500);
            svHiragana.setVisibility(View.GONE);
            alphaKatakana.animate().alpha(1).setDuration(500);
            svKatakana.animate().alpha(1).setDuration(500);
            svKatakana.setVisibility(View.VISIBLE);

            alpha = alphaKatakana;
            sv = svKatakana;
        });
    }


    @Override
    public void onClick(View view) {

        MediaPlayer aHPlay, iHPlay, uHPlay, eHPlay, oHPlay, kaHPlay, kiHPlay, kuHPlay, keHPlay, koHPlay, saHPlay, shiHPlay,
                suHPlay, seHPlay, soHPlay, taHPlay, chiHPlay, tsuHPlay, teHPlay, toHPlay, naHPlay, niHPlay, nuHPlay, neHPlay, noHPlay,
                haHPlay, hiHPlay, fuHPlay, heHPlay, hoHPlay, maHPlay, miHPlay, muHPlay, meHPlay, moHPlay, yaHPlay, yuHPlay, yoHPlay, raHPlay, riHPlay, ruHPlay, reHPlay, roHPlay,
                waHPlay, woHPlay, nHPlay;

        if (view.getId() == R.id.btn_a_h || view.getId() == R.id.btn_a_k) {
            aHPlay = MediaPlayer.create(this, R.raw.a_akira);
            //aHPlay.reset();
            aHPlay.seekTo(0);
            aHPlay.start();
        } else if (view.getId() == R.id.btn_i_h || view.getId() == R.id.btn_i_k) {
            iHPlay = MediaPlayer.create(this, R.raw.i_akira);
            //iHPlay.reset();
            iHPlay.seekTo(0);
            iHPlay.start();
        } else if (view.getId() == R.id.btn_u_h || view.getId() == R.id.btn_u_k) {
            uHPlay = MediaPlayer.create(this, R.raw.u_akira);
            //uHPlay.reset();
            uHPlay.seekTo(0);
            uHPlay.start();
        } else if (view.getId() == R.id.btn_e_h || view.getId() == R.id.btn_e_k) {
            eHPlay = MediaPlayer.create(this, R.raw.e_akira);
            //eHPlay.reset();
            eHPlay.seekTo(0);
            eHPlay.start();
        } else if (view.getId() == R.id.btn_o_h || view.getId() == R.id.btn_o_k) {
            oHPlay = MediaPlayer.create(this, R.raw.o_akira);
            //oHPlay.reset();
            oHPlay.seekTo(0);
            oHPlay.start();
        } else if (view.getId() == R.id.btn_ka_h || view.getId() == R.id.btn_ka_k) {
            kaHPlay = MediaPlayer.create(this, R.raw.ka_akira);
            //kaHPlay.reset();
            kaHPlay.seekTo(0);
            kaHPlay.start();
        } else if (view.getId() == R.id.btn_ki_h || view.getId() == R.id.btn_ki_k) {
            kiHPlay = MediaPlayer.create(this, R.raw.ki_akira);
            //kiHPlay.reset();
            kiHPlay.seekTo(0);
            kiHPlay.start();
        } else if (view.getId() == R.id.btn_ku_h || view.getId() == R.id.btn_ku_k) {
            kuHPlay = MediaPlayer.create(this, R.raw.ku_akira);
            //kuHPlay.reset();
            kuHPlay.seekTo(0);
            kuHPlay.start();
        } else if (view.getId() == R.id.btn_ke_h || view.getId() == R.id.btn_ke_k) {
            keHPlay = MediaPlayer.create(this, R.raw.ke_akira);
            //keHPlay.reset();
            keHPlay.seekTo(0);
            keHPlay.start();
        } else if (view.getId() == R.id.btn_ko_h || view.getId() == R.id.btn_ko_k) {
            koHPlay = MediaPlayer.create(this, R.raw.ko_akira);
            //koHPlay.reset();
            koHPlay.seekTo(0);
            koHPlay.start();
        } else if (view.getId() == R.id.btn_sa_h || view.getId() == R.id.btn_sa_k) {
            saHPlay = MediaPlayer.create(this, R.raw.sa_akira);
            //saHPlay.reset();
            saHPlay.seekTo(0);
            saHPlay.start();
        } else if (view.getId() == R.id.btn_shi_h || view.getId() == R.id.btn_shi_k) {
            shiHPlay = MediaPlayer.create(this, R.raw.shi_akira);
            //shiHPlay.reset();
            shiHPlay.seekTo(0);
            shiHPlay.start();
        } else if (view.getId() == R.id.btn_su_h || view.getId() == R.id.btn_su_k) {
            suHPlay = MediaPlayer.create(this, R.raw.su_akira);
            //suHPlay.reset();
            suHPlay.seekTo(0);
            suHPlay.start();
        } else if (view.getId() == R.id.btn_se_h || view.getId() == R.id.btn_se_k) {
            seHPlay = MediaPlayer.create(this, R.raw.se_akira);
            //seHPlay.reset();
            seHPlay.seekTo(0);
            seHPlay.start();
        } else if (view.getId() == R.id.btn_so_h || view.getId() == R.id.btn_so_k) {
            soHPlay = MediaPlayer.create(this, R.raw.so_akira);
            //soHPlay.reset();
            soHPlay.seekTo(0);
            soHPlay.start();
        } else if (view.getId() == R.id.btn_ta_h || view.getId() == R.id.btn_ta_k) {
            taHPlay = MediaPlayer.create(this, R.raw.ta_akira);
            //taHPlay.reset();
            taHPlay.seekTo(0);
            taHPlay.start();
        } else if (view.getId() == R.id.btn_chi_h || view.getId() == R.id.btn_chi_k) {
            chiHPlay = MediaPlayer.create(this, R.raw.chi_akira);
            //chiHPlay.reset();
            chiHPlay.seekTo(0);
            chiHPlay.start();
        } else if (view.getId() == R.id.btn_tsu_h || view.getId() == R.id.btn_tsu_k) {
            tsuHPlay = MediaPlayer.create(this, R.raw.tsu_akira);
            //tsuHPlay.reset();
            tsuHPlay.seekTo(0);
            tsuHPlay.start();
        } else if (view.getId() == R.id.btn_te_h || view.getId() == R.id.btn_te_k) {
            teHPlay = MediaPlayer.create(this, R.raw.te_akira);
            //teHPlay.reset();
            teHPlay.seekTo(0);
            teHPlay.start();
        } else if (view.getId() == R.id.btn_to_h || view.getId() == R.id.btn_to_k) {
            toHPlay = MediaPlayer.create(this, R.raw.to_akira);
            //toHPlay.reset();
            toHPlay.seekTo(0);
            toHPlay.start();
        } else if (view.getId() == R.id.btn_na_h || view.getId() == R.id.btn_na_k) {
            naHPlay = MediaPlayer.create(this, R.raw.na_akira);
            //naHPlay.reset();
            naHPlay.seekTo(0);
            naHPlay.start();
        } else if (view.getId() == R.id.btn_ni_h || view.getId() == R.id.btn_ni_k) {
            niHPlay = MediaPlayer.create(this, R.raw.ni_akira);
            //niHPlay.reset();
            niHPlay.seekTo(0);
            niHPlay.start();
        } else if (view.getId() == R.id.btn_nu_h || view.getId() == R.id.btn_nu_k) {
            nuHPlay = MediaPlayer.create(this, R.raw.nu_akira);
            //nuHPlay.reset();
            nuHPlay.seekTo(0);
            nuHPlay.start();
        } else if (view.getId() == R.id.btn_ne_h || view.getId() == R.id.btn_ne_k) {
            neHPlay = MediaPlayer.create(this, R.raw.ne_akira);
            //neHPlay.reset();
            neHPlay.seekTo(0);
            neHPlay.start();
        } else if (view.getId() == R.id.btn_no_h || view.getId() == R.id.btn_no_k) {
            noHPlay = MediaPlayer.create(this, R.raw.no_akira);
            //noHPlay.reset();
            noHPlay.seekTo(0);
            noHPlay.start();
        } else if (view.getId() == R.id.btn_ha_h || view.getId() == R.id.btn_ha_k) {
            haHPlay = MediaPlayer.create(this, R.raw.ha_akira);
            //haHPlay.reset();
            haHPlay.seekTo(0);
            haHPlay.start();
        } else if (view.getId() == R.id.btn_hi_h || view.getId() == R.id.btn_hi_k) {
            hiHPlay = MediaPlayer.create(this, R.raw.hi_akira);
            //hiHPlay.reset();
            hiHPlay.seekTo(0);
            hiHPlay.start();
        } else if (view.getId() == R.id.btn_fu_h || view.getId() == R.id.btn_fu_k) {
            fuHPlay = MediaPlayer.create(this, R.raw.fu_akira);
            //fuHPlay.reset();
            fuHPlay.seekTo(0);
            fuHPlay.start();
        } else if (view.getId() == R.id.btn_he_h || view.getId() == R.id.btn_he_k) {
            heHPlay = MediaPlayer.create(this, R.raw.he_akira);
            //heHPlay.reset();
            heHPlay.seekTo(0);
            heHPlay.start();
        } else if (view.getId() == R.id.btn_ho_h || view.getId() == R.id.btn_ho_k) {
            hoHPlay = MediaPlayer.create(this, R.raw.ho_akira);
            //hoHPlay.reset();
            hoHPlay.seekTo(0);
            hoHPlay.start();
        } else if (view.getId() == R.id.btn_ma_h || view.getId() == R.id.btn_ma_k) {
            maHPlay = MediaPlayer.create(this, R.raw.ma_akira);
            //maHPlay.reset();
            maHPlay.seekTo(0);
            maHPlay.start();
        } else if (view.getId() == R.id.btn_mi_h || view.getId() == R.id.btn_mi_k) {
            miHPlay = MediaPlayer.create(this, R.raw.mi_akira);
            //miHPlay.reset();
            miHPlay.seekTo(0);
            miHPlay.start();
        } else if (view.getId() == R.id.btn_mu_h || view.getId() == R.id.btn_mu_k) {
            muHPlay = MediaPlayer.create(this, R.raw.mu_akira);
            //muHPlay.reset();
            muHPlay.seekTo(0);
            muHPlay.start();
        } else if (view.getId() == R.id.btn_me_h || view.getId() == R.id.btn_me_k) {
            meHPlay = MediaPlayer.create(this, R.raw.me_akira);
            //meHPlay.reset();
            meHPlay.seekTo(0);
            meHPlay.start();
        } else if (view.getId() == R.id.btn_mo_h || view.getId() == R.id.btn_mo_k) {
            moHPlay = MediaPlayer.create(this, R.raw.mo_akira);
            //moHPlay.reset();
            moHPlay.seekTo(0);
            moHPlay.start();
        } else if (view.getId() == R.id.btn_ya_h || view.getId() == R.id.btn_ya_k) {
            yaHPlay = MediaPlayer.create(this, R.raw.ya_akira);
            //yaHPlay.reset();
            yaHPlay.seekTo(0);
            yaHPlay.start();
        } else if (view.getId() == R.id.btn_yu_h || view.getId() == R.id.btn_yu_k) {
            yuHPlay = MediaPlayer.create(this, R.raw.yu_akira);
            //yuHPlay.reset();
            yuHPlay.seekTo(0);
            yuHPlay.start();
        } else if (view.getId() == R.id.btn_yo_h || view.getId() == R.id.btn_yo_k) {
            yoHPlay = MediaPlayer.create(this, R.raw.yo_akira);
            //yoHPlay.reset();
            yoHPlay.seekTo(0);
            yoHPlay.start();
        } else if (view.getId() == R.id.btn_ra_h || view.getId() == R.id.btn_ra_k) {
            raHPlay = MediaPlayer.create(this, R.raw.ra_akira);
            //raHPlay.reset();
            raHPlay.seekTo(0);
            raHPlay.start();
        } else if (view.getId() == R.id.btn_ri_h || view.getId() == R.id.btn_ri_k) {
            riHPlay = MediaPlayer.create(this, R.raw.ri_akira);
            //riHPlay.reset();
            riHPlay.seekTo(0);
            riHPlay.start();
        } else if (view.getId() == R.id.btn_ru_h || view.getId() == R.id.btn_ru_k) {
            ruHPlay = MediaPlayer.create(this, R.raw.ru_akira);
            //ruHPlay.reset();
            ruHPlay.seekTo(0);
            ruHPlay.start();
        } else if (view.getId() == R.id.btn_re_h || view.getId() == R.id.btn_re_k) {
            reHPlay = MediaPlayer.create(this, R.raw.re_akira);
            //reHPlay.reset();
            reHPlay.seekTo(0);
            reHPlay.start();
        } else if (view.getId() == R.id.btn_ro_h || view.getId() == R.id.btn_ro_k) {
            roHPlay = MediaPlayer.create(this, R.raw.ro_akira);
            //roHPlay.reset();
            roHPlay.seekTo(0);
            roHPlay.start();
        } else if (view.getId() == R.id.btn_wa_h || view.getId() == R.id.btn_wa_k) {
            waHPlay = MediaPlayer.create(this, R.raw.wa_akira);
            //waHPlay.reset();
            waHPlay.seekTo(0);
            waHPlay.start();
        } else if (view.getId() == R.id.btn_wo_h || view.getId() == R.id.btn_wo_k) {
            woHPlay = MediaPlayer.create(this, R.raw.wo_akira);
            //woHPlay.reset();
            woHPlay.seekTo(0);
            woHPlay.start();
        } else if (view.getId() == R.id.btn_n_h || view.getId() == R.id.btn_n_k) {
            nHPlay = MediaPlayer.create(this, R.raw.n_akira);
            //nHPlay.reset();
            nHPlay.seekTo(0);
            nHPlay.start();
        }
    }
}