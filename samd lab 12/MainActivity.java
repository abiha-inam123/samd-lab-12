package com.example.saschpe.socialfragment.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saschpe.socialfragment.R
import kotlinx.android.synthetic.main.activity_main.*
import saschpe.android.socialfragment.app.SocialFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // Set up social fragment
        val fragment = SocialFragment.Builder()
            // Mandatory
            .setApplicationId("saschpe.alphaplus")
            // Optional
            .setApplicationName("Alpha+ Player")
            .setContactEmailAddress("saschpe@example.com")
            .setFacebookGroup("466079123741258")
            .setGithubProject("saschpe/android-social-fragment")
            .setGitlabProject("saschpe")
            .setTwitterProfile("saschpe")
            // Visual customization
            .setHeaderTextAppearance(R.style.TextAppearance_MaterialComponents_Headline6)
            .setHeaderTextColor(R.color.accent)
            .setIconTint(android.R.color.white)
            .build()

        // Attach it
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_placeholder, fragment)
            .commit()
    }
}