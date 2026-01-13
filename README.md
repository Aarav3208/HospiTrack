# Hospitrack 🏥

Working: https://youtu.be/gYL5T4FtNZM

## 📌 Overview

Hospitrack is a lightweight web application that helps users quickly find hospitals based on their **state** and **district**.
It uses a JSON dataset of hospitals and dynamically populates dropdowns for easy selection. Once a user selects both options and submits, a **table of hospitals** in the chosen district is displayed.

This project is focused on simplicity and usability — no maps, extra pages, or complex navigation.

---

## 🚀 Features

* Dropdowns for **state** and **district**, auto-populated from JSON.
* Search and display hospitals in a **clean tabular format**.
* Lightweight front-end only project (HTML, CSS, JS).
* Fast and responsive UI.

---

## 🛠️ Tech Stack

* **Frontend**: HTML, CSS, JavaScript
* **Data**: JSON file (hospital dataset)

---

## 📂 Project Structure

```
Hospitrack/
│── index.html        # Main UI with form & results table
│── style.css         # Styling
│── script.js         # Logic for dropdowns & hospital display
│── hospitals.json    # Data source (states, districts, hospitals)
│── README.md         # Project documentation
```

---

## ⚙️ How It Works

1. User selects a **state** from the dropdown.
2. The **district dropdown** updates based on the state.
3. User clicks **Submit**.
4. A table is displayed with all hospitals for that state & district.

---

## 📸 Demo (Example Workflow)

1. Select **Maharashtra** as state.
2. Select **Pune** as district.
3. Click **Submit** → A list of hospitals in Pune is displayed.

---

## 📦 Installation & Usage

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/hospitrack.git
   ```
2. Open the project folder:

   ```bash
   cd hospitrack
   ```
3. Run locally by simply opening `index.html` in your browser.

---

## 🔮 Future Enhancements

* Add search/filter within hospital results.
* Include contact details & specializations.
* Deploy online (GitHub Pages / Netlify).

---

## 📝 License

This project is open-source under the **MIT License**.

---
