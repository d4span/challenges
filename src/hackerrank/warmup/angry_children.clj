(ns warmup.angry-children)

;; https://www.hackerrank.com/challenges/angry-children

(def N (Long/parseLong (read-line)))

(def K (Long/parseLong (read-line)))

(def numbers
  (loop [n 0
         nums []]
    (if (< n N)
      (recur (inc n) (conj nums (Long/parseLong (read-line))))
      (vec (sort nums)))))

(loop [n    0
       ufs  []]
  (if (< (- N K n) 1)
    (println (reduce min ufs))
    (let [ufmin (numbers n)
          ufmax (numbers (- (+ n K) 1))
          uf (- ufmax ufmin)]
      (recur (inc n) (conj ufs uf)))))