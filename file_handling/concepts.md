Java's File Handling allows you to:

Create, read, write, append, and delete files.

## Mainly used to work with text files (.txt), but you can also handle binary files, images, etc.

Package Purpose
java.io Core classes like File, FileWriter, FileReader, etc.
java.util Scanner class (used for reading files line by line)

---

COMMON OPERATIONS (Basics)
Operation.... Class... Used... Notes
Create file...File... Checks if file exists, creates if not
Write to file...FileWriter... Overwrites file unless you append
Read from file... FileReader, Scanner... Reads file content
Append to file... FileWriter(file, true)... Appends instead of overwriting
Delete file...File... Deletes file

---

What Happens If File Already Exists?
Operation Behavior
createNewFile()... Won’t create file again. Returns false if file already exists.
FileWriter("file.txt")... Overwrites the whole file – old data is erased. ⚠️
FileWriter("file.txt", true)... Appends new content at the end. Old data is safe ✅

---

all key classes names

file

filewriter
bufferedwriter
printwriter

filereader
bufferedreader
scanner

---

all classes if v deal with binary files

Class Name ....Purpose
FileInputStream ...Read raw bytes from a file
FileOutputStream ...Write raw bytes to a file
BufferedInputStream ...Faster byte reading
BufferedOutputStream ...Faster byte writing

---

all basic operations
create
write,append to file
read
delete
print to file

---

difference between print and write to file

1. Write to File
   🔹 Means writing raw characters or strings into a file using classes like:

FileWriter

BufferedWriter

Key Points:
Only writes what you provide.

No automatic \n or formatting.

Faster, but more manual.

Used when you just want to store content.

2. Print to File
   🔹 Means writing content as if printing to console, using:

PrintWriter

Key Points:
Behaves like System.out.print() but writes to file.

Supports:

print(), println(), printf()

Auto-handles formatting (like new lines).

Very useful for readable output and logs.

---

Almost all file operations can throw exceptions like:

IOException

FileNotFoundException
