# KnowinGit 5.0

Open-source contribution lab repository for KnowinGit 5.0, designed for second-year undergraduate engineering students.

The goal of this activity is to introduce students to the real-world workflow of open-source development: reading unfamiliar code, reproducing reported bugs, making localized fixes, testing, and opening standard GitHub Pull Requests.

---

## Repository Contents

```text
KnowinGit-5.0/
|-- README.md                           # Main repository documentation
|-- CONTRIBUTING.md                     # Contributor workflow guide
|-- LICENSE                             # MIT License
|-- .gitignore                          # Build artifact ignores
|
|-- components/                         # Component source code
|   |-- c/                              # 40 C components (C01 through C40)
|   |   |-- C01/                        # student_search.h, student_search.c, README.md
|   |   `-- ...
|   |
|   `-- java/                           # 40 Java components (J01 through J40)
|       |-- J01/                        # StudentSearch.java, README.md
|       `-- ...
|
|-- tests/                              # Regression test suites
|   |-- c/                              # 40 C test suites (C01 through C40)
|   |   |-- C01/                        # test_student_search.c
|   |   `-- ...
|   |
|   `-- java/                           # 40 Java test suites (J01 through J40)
|       |-- J01/                        # StudentSearchTest.java
|       `-- ...
|
|-- scripts/
|   `-- test-component.sh               # Standalone regression test runner
|
`-- .github/
    |-- pull_request_template.md        # Standardized PR template
    `-- workflows/
        `-- component-tests.yml         # CI workflow testing only changed components
```

---

## Subsystems

1. **`core-records` (C01-C10, J01-J10):** Student identification lookup, marks averaging, grade thresholds, duplicate validation, record deletion, score sorting, parity counts, and array aggregation.
2. **`core-algorithms` (C11-C20, J11-J20):** Frequency counting, first match lookup, reversal routines, list insertion, value removal, binary search, cyclic rotation, range filters, and extreme value indices.
3. **`core-strings` (C21-C36, J21-J36):** Palindrome checks, vowel/digit counters, exact matching, case-insensitive comparison, word tokenizers, character search/replace, space compressors, and letter filters.
4. **`core-buffers` (C37-C40, J37-J40):** Bounded stack implementations, LIFO pointer management, FIFO queue order, and capacity boundary guards.

---

## Quick Start

1. **Browse Issues:** Review open bug reports in [`docs/issue-bank.md`](docs/issue-bank.md) or the GitHub Issues tab.
2. **Run Tests:**
   ```bash
   # Run regression tests for C component C01
   ./scripts/test-component.sh c/C01

   # Run regression tests for Java component J01
   ./scripts/test-component.sh java/J01
   ```
3. **Contribute:** Follow the step-by-step workflow in [`CONTRIBUTING.md`](CONTRIBUTING.md).

---

## License

This project is licensed under the [MIT License](LICENSE).
