(ns warmup.is-fibo)

;; Challenge https://www.hackerrank.com/challenges/is-fibo

(defn fibs-up-to [n]
  (loop [fibs '(1 0)]
    (let [head (nth fibs 0)
          head-1 (nth fibs 1)
          next (+ head head-1)]
      (if (> next n)
        fibs
        (recur (conj fibs next))))))

(defn create-fibs []
  (into #{} (fibs-up-to 10000000000)))

(def fibs (create-fibs))

(def T (Long/parseLong (read-line)))

(defn run []
  (loop [n (Long/parseLong (read-line))
         i 1]
    (if (<= i T)
      (do
        (println (if (contains? fibs n)
                   "IsFibo"
                   "IsNotFibo"))
        (recur (Long/parseLong (read-line)) (+ i 1))))))

; (println (solveMeFirst (Integer/parseInt a) (Integer/parseInt b)))