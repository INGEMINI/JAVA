1. What is AWT?
   AWT = Abstract Window Toolkit

It’s the original Java GUI toolkit introduced in Java 1.0

Provides basic GUI components like Buttons, TextFields, Labels, Lists, etc.

Uses native OS components — meaning AWT components are heavyweight (depend on OS GUI controls)

## Comes with basic event handling mechanisms

2. What is Swing?
   Swing is built on top of AWT but is much richer

Introduced in Java 1.2 as part of Java Foundation Classes (JFC)

Provides lightweight components (drawn by Java, not native OS)

Swing components are more flexible, customizable, and consistent across platforms

Common Swing classes start with J (like JFrame, JButton, JLabel).

---

// 3. Key Differences between AWT and Swing

Feature - AWT - Swing
Components - Heavyweight (native OS) - Lightweight (Java rendered)  
Look & Feel - Depends on OS look - Pluggable, customizable  
Components Set - Basic (Button, Label, etc.) - Rich (JButton, JTable, JTree)  
Performance - Faster (uses native peers) - Slightly slower (Java painted)  
Flexibility - Less customizable - Highly customizable
