# 🚀 App Portafolio y Conexión Web

Esta es una aplicación nativa para Android desarrollada como **Prototipo 2**. Su objetivo principal es servir como un "Hub" central que conecta a los usuarios con nuestro proyecto web alojado en **Vercel** y nuestras redes sociales (**Instagram**), facilitando además vías de contacto directo (llamadas, emails y ubicación).

🛠️ **Información Técnica:**
* **Versión de Android API Mínima:** API 24 (Android 7.0)
* **Versión de Android Gradle Plugin (AGP):** [Escribe aquí tu versión, ej: 8.2.0]
* **Lenguaje:** Java

---

## 🧭 Listado de Intents Implementados

La aplicación utiliza un total de **8 Intents** para mejorar la navegación y experiencia del usuario, divididos de la siguiente manera:

### 📲 Eventos Explícitos (3)
Permiten la navegación interna de la aplicación:

1. **`MainActivity` → `DetalleActivity`**: 
   * **Descripción:** Pasa de la pantalla principal a los detalles del proyecto.
   * **Dato extra:** Envía el nombre del usuario validado mediante `putExtra`.
   * **Prueba:** Escribir un nombre en el inicio y presionar "Ver Proyecto".
2. **`MainActivity` → `ConfigActivity`**: 
   * **Descripción:** Abre una pantalla simulada de ajustes internos.
   * **Prueba:** Presionar el botón "Ajustes de App" en el inicio.
3. **`MainActivity` → `AyudaActivity`**: 
   * **Descripción:** Muestra un tutorial o guía de uso rápido.
   * **Prueba:** Presionar el botón "Ayuda / FAQ" en el inicio.

### 🌍 Eventos Implícitos (5)
Conectan la app con aplicaciones y sistemas externos:

1. **Abrir Web Específica (`ACTION_VIEW`)**:
   * **Descripción:** Abre el navegador nativo para visitar nuestra web en Vercel y nuestro Instagram.
   * **Prueba:** En `DetalleActivity`, presionar "Ver Web Vercel" o "Ver Instagram".
2. **Abrir Marcador Telefónico (`ACTION_DIAL`)**:
   * **Descripción:** Prepara el teclado numérico del celular para llamar al equipo de soporte.
   * **Prueba:** En `DetalleActivity`, presionar "Llamar al equipo".
3. **Enviar Correo Electrónico (`ACTION_SENDTO`)**:
   * **Descripción:** Abre la app de correo (ej. Gmail) con el destinatario prellenado.
   * **Prueba:** En `DetalleActivity`, presionar "Enviar Correo".
4. **Ver Ubicación (`geo:lat,lng`)**:
   * **Descripción:** Abre Google Maps mostrando la ubicación de nuestra sede (Santo Tomás).
   * **Prueba:** En `DetalleActivity`, presionar "Ubicación Sede".
5. **Configuración de Dispositivo (`ACTION_WIFI_SETTINGS`)**:
   * **Descripción:** Atajo para abrir los ajustes de red del teléfono y verificar conexión.
   * **Prueba:** En `ConfigActivity`, presionar "Revisar conexión Wi-Fi".

---

## 📸 Capturas de Pantalla

*(Nota para el equipo: Reemplazar estos enlaces por las capturas reales cuando terminen el diseño)*

1. ![Inicio de la App](enlace-a-imagen-1) - *Pantalla Principal con validación*
2. ![Detalle y Enlaces](enlace-a-imagen-2) - *Pantalla de Detalles*
3. ![Ajustes](enlace-a-imagen-3) - *Pantalla de Configuración*
4. ![Redirección Web](enlace-a-imagen-4) - *App abriendo web en Vercel*

---

## 📦 Instrucciones para Compilar y Probar

1. Clona este repositorio: `git clone [URL_DEL_REPO]`
2. Abre el proyecto utilizando **Android Studio**.
3. Espera a que Gradle sincronice las dependencias.
4. Conecta un dispositivo físico con depuración USB o inicia un emulador.
5. Haz clic en el botón **Run (▶)** en la barra superior.

> **Nota:** El archivo APK de prueba (`app-debug.apk`) se encuentra en la ruta: `app/build/outputs/apk/debug/`
