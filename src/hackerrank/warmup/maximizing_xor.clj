(ns warmup.maximizing-xor)

;; https://www.hackerrank.com/challenges/maximizing-xor

(defn max-xor-for-l [r l]
  (let [c (range (+ l 1) (+ r 1))
        f (partial bit-xor l)
        x (map f c)
        m (apply max x)]
    m))

(defn maxXor [l r]
  (if (= l r)
    0
    (let [c (range l r)
          f (partial max-xor-for-l r)
          x (map f c)
          m (apply max x)]
      m)))