package com.blurr.voice

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

/**
 * Pro is enabled for everyone now, so this screen no longer runs any purchase
 * flow - it just confirms Pro access is active.
 */
class ProPurchaseActivity : BaseNavigationActivity() {

    private lateinit var priceTextView: TextView
    private lateinit var purchaseButton: Button
    private lateinit var loadingProgressBar: ProgressBar
    private lateinit var backButton: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pro_purchase)

        priceTextView = findViewById(R.id.price_text)
        purchaseButton = findViewById(R.id.purchase_button)
        loadingProgressBar = findViewById(R.id.loading_progress)
        backButton = findViewById(R.id.back_button)

        loadingProgressBar.visibility = View.GONE
        purchaseButton.visibility = View.GONE
        priceTextView.text = "You already have Pro access ✓"

        backButton.setOnClickListener {
            finish()
        }
    }

    override fun getContentLayoutId(): Int = R.layout.activity_pro_purchase

    override fun getCurrentNavItem(): NavItem = NavItem.UPGRADE
}
