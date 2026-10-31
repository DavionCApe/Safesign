# SafeSign Application

**SafeSign** is an educational and safety-focused Android application designed specifically for crèche (preschool) and primary school children. The application serves two core purposes: teaching young children to recognize essential safety signs and providing an intuitive, immediate alert system to notify trusted adults if a child is in danger.

---

## 🌟 Core Features

### 1. Interactive Safety Sign Learning
*   **Visual-First Design:** Optimized for young children who cannot yet read fluidly, using bright, clear standard safety iconography (e.g., Pedestrian Crossing, Danger High Voltage, Wet Floor, Stop).
*   **Audio Assistance:** Integrated text-to-speech or pre-recorded audio cues that read definitions out loud when a sign is selected.
*   **Gamified Quizzes:** Simple matching exercises to test the child's understanding of safety layouts with positive reinforcement rewards.

### 2. Emergency Alert System
*   **One-Touch SOS Mechanism:** A prominent, easily accessible emergency trigger designed for early childhood coordination.
*   **Automated Notifications:** Instant alert dispatching via SMS or cellular network to pre-configured emergency contacts (parents, guardians, or school administrators).
*   **Location Sharing:** Broadcasts real-time geographic data to help guardians locate the child quickly during a crisis.

---

## 🛠️ Required Configurations

Before building the final Android `.apk`, ensure the following parameters are populated with the correct local administrative values:

### Emergency Contact Setup
Locate your configuration parameters (commonly found in your application's settings array or local database initialization scripts) and provide your destination endpoints:
*   `PRIMARY_EMERGENCY_CONTACT`: Main phone number or endpoint for alerts (e.g., Parent/Guardian).
*   `SECONDARY_EMERGENCY_CONTACT`: Secondary or fallback endpoint (e.g., School Administrative Office).

### Hardware Permissions Gateway
To ensure functionality across all deployment environments, verify that the Android wrapper requests and receives authorization for:
*   `android.permission.ACCESS_FINE_LOCATION` (Real-time tracking when an alert is active)
*   `android.permission.SEND_SMS` (Direct cellular messaging infrastructure)

---

## 🚀 Secure CI/CD Publishing

This project includes automated supply chain security enforcement utilizing the **OSSF SLSA Level 3 Framework**. 
*   **Workflow Path:** `.github/workflows/generator-generic-ossf-slsa3-publish.yml`
*   **Purpose:** Builds and packages the application transparently, generating a non-falsifiable provenance record ensuring the resulting Android package is authenticated and free from third-party tamper artifacts.
