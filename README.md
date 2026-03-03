## Basic GitHub Command

```
git init
git add .
git commit -m "Initial project with tests"
git branch -M main
git remote add origin <YOUR_REPO_URL>
git push -u origin main
```

## How to test?
1. Modify the CalculatorTest:
```java
assertEquals(6, c.add(2, 3));
```
2. Push the code
3. Go to the GitHub Actions tab. Then you can see the result.