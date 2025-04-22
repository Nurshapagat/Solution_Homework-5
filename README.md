# Proxy & Flyweight Patterns

## Project Description
This project demonstrates the use of Proxy and Flyweight design patterns. Both patterns are used to improve performance, memory efficiency, and system effectiveness.

## Patterns:
- **Proxy Pattern** — Load high-resolution images only when required.
- **Flyweight Pattern** — Use shared marker styles to save memory.

---

## 1. Proxy Pattern
### **Problem:**
Real estate agents upload high-resolution images, but loading them immediately can slow down the website.

### **Solution:**
The Proxy pattern will immediately display a low-quality version of the image and load a full-quality image only when requested by the user. In addition, only authorized agents can upload images (protective proxy). 

### Benefits of the Pattern:
- Displaying low-resolution images immediately: The Proxy pattern ensures that low-resolution thumbnails are displayed immediately.
- Loading the full image on demand: The high-resolution image is only loaded when requested by the user, making the system more efficient.

- Performance: By loading high-resolution images only when needed, it saves memory and reduces loading time.
- User Experience: The user first sees a low-resolution image, and then the full image loads when requested, enhancing speed and efficiency.

### **Bonus**
A Protection Proxy was added to ensure that only logged-in agents can upload or replace images. If an agent is not logged in, the image upload is rejected.

## 2. Flyweight Pattern
### **Problem:**
A map application needs to render thousands of location markers (e.g., hospitals, restaurants). Creating a new object for each marker is memory-intensive.

### **Solution:**
Provides style sharing, which means that for each marker, style objects are reused and memory is used more efficiently.

### Benefits of the Pattern:
- Memory Saving: The Flyweight pattern uses shared marker styles, which reduces memory consumption by preventing duplicate style objects.
- Performance: By reducing the number of objects created, system performance is improved, and resources are used more efficiently.

### **Bonus**
The pattern includes logging how many unique style objects are created compared to the total number of markers, showing the efficiency gain in terms of memory.

## **3. UML diagrams**
- Diagrams for the Proxy Pattern and Flyweight Pattern can be included to help explain how they work visually.
