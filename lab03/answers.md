# Lab 3 Answers

## Part 1: Git

### 1.1. List the contents of the lab03-exercises repo immediately after initialization
```
# total 0
drwxrwxrwx 1 alwilu alwilu 4096 Sep  5 10:38 .
drwxrwxrwx 1 alwilu alwilu 4096 Sep  5 10:30 ..
drwxrwxrwx 1 alwilu alwilu 4096 Sep  5 10:38 .git
-rwxrwxrwx 1 alwilu alwilu   12 Sep  5 10:34 README.md


```

### 1.2. Paste the output of your `git status` command
```
# On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        README.md

nothing added to commit but untracked files present (use "git add" to track)


```

### 1.3. Paste the output of the state of your repository after committing your README.md file
```
# On branch main
nothing to commit, working tree clean


```

### 1.4. Copy your `git log` output
```
# commit f7a4cbd2a9d651c022aa93d64c138a51f144c132 (HEAD -> main)
Author: alwillis4 <awillis4@unca.edu>
Date:   Thu Sep 5 10:51:15 2024 -0400

    add README.md to the repository


```

### 1.5. Copy your `git diff` output
```
# diff --git a/README.md b/README.md
index cffc80c..c2ac74f 100644
--- a/README.md
+++ b/README.md
@@ -1 +1,3 @@
-My third lab
\ No newline at end of file
+My third lab
+Find All Duplicates
+Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.
\ No newline at end of file


```


### 1.6. Reflection

We've learned 6 git subcommands now. Describe each of them in your own words in the section below:

* git init -initialize a repository for you
* git status - tells you which of the files in your current directory are different from the latest commit in the repo.
* git add - stages the listed file to be commited 
* git commit - saves a snapshot of staged files at the exact moment commit is issued
* git log - shows commit history
* git diff - shows what changes have been made to a file.


### 1.7. Practice: Find All Duplicates (Java)
Make sure you implement the `FindDuplicates.java` class as specified in the instructions (with the nested loops implementation).

## Part 2: GitHub

### 2.1. Practice: Find All Duplicates (Python)
Make sure you implement the `find_duplicates.py` file as specified in the instructions (with the nested loops implementation).


## Part 3: Branching

### 3.1. Implement the More Efficient Version of the "Find Duplicates" problem
Implement the more efficient Version of the "Find Duplicates" problem using a dictionary (or hashmap) data structure instead of nested loops. You may do this in either your Python file or in the Java file that you’ve already made. Do this by adding a second function/method to your Java/Python file with a slightly different name.


### 3.2. Link to Repo
Please make sure that the new repo that you made today on GitHub is public, and paste a link to it below.

```bash
 https://github.com/alwillis4/lab03-exercises/pull/1

```

### 3.3. What do the three "Merge pull request" options mean? 
Describe each of them in your own words.
Merge commit merges the history of the two branches
Squah and Merge with take the comment of the new branch and squash them into one on the main branch
Rebase and Merge will have the commits rebase on to the main branch
